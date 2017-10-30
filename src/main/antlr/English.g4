grammar English;

WHITESPACE : (' ' | '\n')+ -> channel(HIDDEN);
//NOUN : ([a-z] | [A-Z])+ '_' 'noun';
//PRONOUN : ([a-z] | [A-Z])+ '_' 'pronoun';
//VERB : ([a-z] | [A-Z])+ '_' 'verb';
//ADJ : ([a-z] | [A-Z])+ '_' 'adjective';
//ADV : ([a-z] | [A-Z])+ '_' 'adverb';
//PREP : ([a-z] | [A-Z])+ '_' 'preposition';
//CONJ : ([a-z] | [A-Z])+ '_' 'conjunction';
//INTERJ : ([a-z] | [A-Z])+ '_' 'interjection';

ADJ : 'adjective';
VERB : 'verb';
ADV : 'adverb';
PREP : 'preposition';
CONJ : 'conjunction';
INTERJ : 'interjection';
NOUN : 'noun';
PRONOUN : 'pronoun';
PERIOD : '.';

sentence : noun_phrase verb_phrase PERIOD;
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
