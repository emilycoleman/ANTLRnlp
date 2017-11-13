//Uses the Penn Treebank Project method of tagging
//https://www.ling.upenn.edu/courses/Fall_2003/ling001/penn_treebank_pos.html

grammar English;

@header {
    package com.generated.parser;
}

WHITESPACE : (' ' | '\n')+ -> channel(HIDDEN);

NOUN : WORD '_NN' //singular noun
| WORD '_PRP' //personal pronoun
| WORD '_NNS' //plural
| WORD '_NNP' //proper
| WORD '_NNPS'; //proper and plural
VERB : WORD '_VB'
| WORD '_VBD' //past tense
| WORD '_VBG' //gerund or present participle
| WORD '_VBN' //past participle
| WORD '_VBP' //1st/2nd person singular present
| WORD '_VBZ'; //3rd person singular present
DETERMINER : WORD '_DT'
| WORD '_PRP$';
ADJ : WORD '_JJ'
| WORD '_JJR'
| WORD '_JJS'
| WORD '_CD'; //Cardinal number
ADV : WORD '_RB'
| WORD '_RBR' //comparative
| WORD '_RBS'; //superlative
CONJ : WORD '_CC'; //coordinating conjunction
PREP : 	WORD '_IN';
MODAL : WORD '_MD';

PERIOD : '._.';

fragment WORD : ([a-z] | [A-Z])+;

sentence : clause
| clause PERIOD
| clause CONJ sentence PERIOD; //adjust to include as many independent clauses as you want

clause : noun_phrase verb_phrase;

noun_phrase : adjective_phrase noun_phrase
| DETERMINER noun_phrase
| noun_phrase adjective_phrase
| noun_phrase noun_phrase
| noun_phrase CONJ noun_phrase
| NOUN;

adjective_phrase : adjective_phrase adjective_phrase
| adverbial_phrase adjective_phrase
| prepositional_phrase
| ADJ;

adverbial_phrase : adverbial_phrase adverbial_phrase
| prepositional_phrase
| ADV;

verb_phrase : VERB
| MODAL
| verb_phrase VERB
//Pattern 1
| adverbial_phrase verb_phrase
| verb_phrase adverbial_phrase
| verb_phrase adjective_phrase
//Patterns 2 and 4
| verb_phrase adjective_phrase
//Patterns 3, 5, 7
| verb_phrase noun_phrase;

prepositional_phrase : PREP noun_phrase;
