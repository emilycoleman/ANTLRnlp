//Uses the Penn Treebank Project method of tagging
//https://www.ling.upenn.edu/courses/Fall_2003/ling001/penn_treebank_pos.html
//Customized tags: _PREP, _SCONJ

grammar English;

@header {
    package com.generated.parser;
}

WHITESPACE : (' ' | '\n')+ -> channel(HIDDEN);

NOUN : WORD '_NN'   //singular noun
| WORD '_PRP'       //personal pronoun
| WORD '_NNS'       //plural
| WORD '_NNP'       //proper
| WORD '_NNPS';     //proper and plural
WH_NOUN : WORD '_WP'//wh-pronoun
| WORD '_WP$';      //possessive wh-pronoun
VERB : WORD '_VB'
| WORD '_VBD'       //past tense
| WORD '_VBG'       //gerund or present participle
| WORD '_VBN'       //past participle
| WORD '_VBP'       //1st/2nd person singular present
| WORD '_VBZ'       //3rd person singular present
| WORD '_RP';       //particle
DETERMINER : WORD '_DT'
| WORD '_PRP$'      //possessive pronoun
| WORD '_PDT';      //predeterminer
WH_DET : WORD '_WDT';//wh-determiner**
ADJ : WORD '_JJ'
| WORD '_JJR'
| WORD '_JJS'
| WORD '_CD'        //Cardinal number
| WORD '_POS'       //possessive ending
| WORD '_EX';       //existential there
ADV : WORD '_RB'
| WORD '_RBR'       //comparative
| WORD '_RBS';      //superlative
WH_ADV : WORD '_WRB';//wh-adverb**
CCONJ : WORD '_CC'; //coordinating conjunction
SCONJ : WORD '_SCONJ';//subordinating conjunction
TO : WORD '_TO';    //the word "to"
PREP : WORD '_PREP';
IN : WORD '_IN';    //preposition or subordinating conjunction
MODAL : WORD '_MD';
INTERJECTION : WORD '_UH'; //Interjection

fragment WORD : ([a-z] | [A-Z])+;

sentence : (INTERJECTION)* independent_clause (CCONJ independent_clause | dependent_clause)* ;
clause : subject predicate;
independent_clause : clause;

dependent_clause :
  subordinating_conjunction clause
| subordinating_conjunction predicate;

subordinating_conjunction :
  SCONJ
| IN
| WH_NOUN
| WH_ADV
| WH_DET;

subject: noun_phrase;
predicate: verb_phrase;

noun_phrase :
  adjective_phrase noun_phrase
| noun_phrase adjective_phrase
| DETERMINER noun_phrase
| noun_phrase CCONJ noun_phrase
| noun_phrase noun_phrase
| NOUN;

adjective_phrase :
  adjective_phrase adjective_phrase
| adverbial_phrase adjective_phrase
| prepositional_phrase
| dependent_clause
| ADJ;

adverbial_phrase :
  adverbial_phrase adverbial_phrase
| prepositional_phrase
| ADV;

prepositional_phrase :
  PREP noun_phrase
| IN noun_phrase
| TO noun_phrase
| PREP ADV;   //e.g. "I'm in here."

verb_phrase :
//Pattern 1
  adverbial_phrase verb_phrase
| verb_phrase adverbial_phrase
| verb_phrase adjective_phrase
//Patterns 2 and 4
| verb_phrase adjective_phrase
//Patterns 3, 5, 7
| verb_phrase noun_phrase
//Infinitives
| infinitive
| verb_phrase infinitive
| infinitive verb_phrase
//Conjunctions
| verb_phrase CCONJ verb_phrase
//Basic definitions
| verb_phrase VERB
| MODAL
| VERB;

infinitive : TO VERB; //assuming split infinitives are grammatically incorrect
