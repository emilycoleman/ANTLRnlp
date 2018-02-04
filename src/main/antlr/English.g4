//Uses the Penn Treebank Project method of tagging
//https://www.ling.upenn.edu/courses/Fall_2003/ling001/penn_treebank_pos.html

grammar English;

@header {
    package com.generated.parser;
}

WHITESPACE : (' ' | '\n')+ -> channel(HIDDEN);

NOUN : WORD '_NN'   //singular noun
| WORD '_PRP'       //personal pronoun
| WORD '_WP'        //wh-pronoun
| WORD '_WP$'       //possessive wh-pronoun
| WORD '_NNS'       //plural
| WORD '_NNP'       //proper
| WORD '_NNPS';     //proper and plural
VERB : WORD '_VB'
| WORD '_VBD'       //past tense
| WORD '_VBG'       //gerund or present participle
| WORD '_VBN'       //past participle
| WORD '_VBP'       //1st/2nd person singular present
| WORD '_VBZ'       //3rd person singular present
| WORD '_TO'        //to
| WORD '_RP';       //particle
DETERMINER : WORD '_DT'
| WORD '_WDT'       //wh-determiner
| WORD '_PRP$'      //possessive pronoun
| WORD '_PDT';      //predeterminer
ADJ : WORD '_JJ'
| WORD '_JJR'
| WORD '_JJS'
| WORD '_CD'        //Cardinal number
| WORD '_POS'       //possessive ending
| WORD '_EX';       //existential there
ADV : WORD '_RB'
| WORD '_RBR'       //comparative
| WORD '_RBS'       //superlative
| WORD '_WRB';      //wh-adverb
CCONJ : WORD '_CC'; //coordinating conjunction
IN : WORD '_IN';    //preposition or subordinating conjunction
MODAL : WORD '_MD';

PERIOD : '._.';

fragment WORD : ([a-z] | [A-Z])+;

//next thing: differentiate between a subject and a noun

sentence : clause
| clause PERIOD
| clause CCONJ clause PERIOD //adjust to include as many independent clauses as you want
| clause IN clause PERIOD
;

clause :
| noun_phrase verb_phrase;

noun_phrase : adjective_phrase noun_phrase
| DETERMINER noun_phrase
| noun_phrase adjective_phrase
| noun_phrase noun_phrase
| noun_phrase CCONJ noun_phrase
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

prepositional_phrase : IN noun_phrase;
