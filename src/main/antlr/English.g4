//Uses the Penn Treebank Project method of tagging
//https://www.ling.upenn.edu/courses/Fall_2003/ling001/penn_treebank_pos.html

grammar English;

WHITESPACE : (' ' | '\n')+ -> channel(HIDDEN);

NOUN : ([a-z] | [A-Z])+ '_' 'NN' //singular noun
| ([a-z] | [A-Z])+ '_' 'PRP' //personal pronoun
| ([a-z] | [A-Z])+ '_' 'NNS' //plural
| ([a-z] | [A-Z])+ '_' 'NNP' //proper
| ([a-z] | [A-Z])+ '_' 'NNPS'; //proper and plural
VERB : ([a-z] | [A-Z])+ '_' 'VB'
| ([a-z] | [A-Z])+ '_' 'VBD' //past tense
| ([a-z] | [A-Z])+ '_' 'VBG' //gerund or present participle
| ([a-z] | [A-Z])+ '_' 'VBN' //past participle
| ([a-z] | [A-Z])+ '_' 'VBP' //1st/2nd person singular present
| ([a-z] | [A-Z])+ '_' 'VBZ'; //3rd person singular present
DETERMINER : ([a-z] | [A-Z])+ '_' 'DT';
ADJ : ([a-z] | [A-Z])+ '_' 'JJ'
| ([a-z] | [A-Z])+ '_' 'JJR'
| ([a-z] | [A-Z])+ '_' 'JJS';
ADV : ([a-z] | [A-Z])+ '_' 'RB'
| ([a-z] | [A-Z])+ '_' 'RBR' //comparative
([a-z] | [A-Z])+ '_' 'RBS'; //superlative
CONJ : ([a-z] | [A-Z])+ '_' 'CC'; //coordinating conjunction

PERIOD : '.';

sentence : clause PERIOD | clause CONJ clause PERIOD; //adjust to include as many independent clauses as you want

clause : noun_phrase verb_phrase;

noun_phrase : adjective_phrase noun_phrase
| noun_phrase adjective_phrase
| noun_phrase noun_phrase
| noun_phrase CONJ noun_phrase
| NOUN;

adjective_phrase : adverbial_phrase adjective_phrase
| ADJ adjective_phrase
| ADJ;

adverbial_phrase : adverbial_phrase adverbial_phrase
| ADV;

verb_phrase : adverbial_phrase verb_phrase
| verb_phrase adverbial_phrase
| verb_phrase VERB
| VERB;
