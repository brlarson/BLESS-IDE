package com.multitude.bless.exceptions;

import com.multitude.bless.app.Global;
import com.multitude.bless.app.Time;
import com.multitude.bless.ui.preferences.ConfigurationPreferencePage;


public class
HelpfulHints
{

	public static String[] 
hint = new String[]		//node type names
	{
	"Try putting parentheses around your boolean expressions.",
	"Boolean expressions and first-order predicates are similar, but different.",
	"If your program is becoming long and convoluted, try breaking it into a \n"+
		"shell that decides what to do and calls several other procedures or \n"+
		"functions to do the state transformation.",
	"Write postconditions first, then preconditions, before writing a"+
		" single temporal logic formula.",
	"Eat a good breakfast every morning.",
	"i before e (except after c) or pronounced long A, as in neighbor or weigh",
	"Label transitions to choose how they\'re sorted.",
	"Maximize elgance whenever possible."
	};	//end of hint

	public static String[] 
epithet = new String[]		//node type names
	{
	"You are an idiot.",
	"You goofed again.",
	"You need more exercise.",
	"You need a rest.",
	"I can see you\'re not looking well, "+System.getProperty("user.name")+".  ",
	"People with fit sexy bodies get much more exercise than you do.",
	"Perhaps you need a rest.",
	"You are depriving a village, somewhere, of an idiot.",
	"You should consider another occupation.",
	"Your mother wears pink toenail polish.",
	"A top programmer\'s brain is like a ballerina's body. \n "+
			"Your brain is fat and lazy.\n  Go watch TV.  It\'s all for which you\'re good.",
	"You suck.",
	"Even dogs think your farts smell bad.",
	"Perhaps you'd enjoy the tasks performed by florists.",
	"You are your mother's least favorite child.",
	"Why do you persist when you obviously have the intellect of a sea sponge.",
	"Everyone knows why you spend so much time in the bathroom.",
	"Have you considered rewriting this program from scratch?",
	"Why have you been having such difficulty with such simple things?",
	"Don\'t get angry with me, I'm just trying to help.",
	"Do you notice people stifling their laughter when you say your name is "+
			System.getProperty("user.name")+"?  ",
	 "You have a face made for internet dating.",
	 "Sit up straight!  Hold in your gut!  Breathe deeply!  Blink often!",
	 "Why do you persist when you\'re obviously stupid?",
	 "Hey!  Take a break.  You need it.  You\'re obviously not getting anything done here.",
	 "There are some people who don\'t know when to quit.",
	 "You make bigots who viscerally loathe George W. Bush seem reasonable, rational, and intelligent.",
	 "The rain in Spain falls mainly on those who complain.",
	 "Your deepest un-expressed crush also had a crush on you, of which they stifled any expression.\n"+
	 		"You lost out on the love of your life because you were a coward.  Loser.",
	 "Your ass is grass.",
	 "Did you play too many contact sports in high school, or are you naturally stupid?",
	 "Good manners and bad breath will get you nowhere.  \nFloss the "+
	 		"rotting garbage from between your teeth each time you eat.",
	 "Masturbation does not count as exercise.",
	 "When was the last day that you did 100 push-ups?",
	 "The Road to Serfdom is preferred by those who would rule.",
	 "Politicians that rob Peter to pay Paul can count on support from Paul.",
	 "Your love life doesn\'t exist because you\'re unlovable.",
	 "You deserve a reputation for being humble.",
	 "Your reputation for modesty is well deserved.",
	 "This shows your efforts are sure to fail.",
	 "Obviously, you're incapable.",
	 "If you understood the behavior of matter, energy, and information mathematically "+
	 	"you\'d be able to force your will upon them.",
	"God made the pretty girls that way because he loves them more.",
	"Your personality is well suited to solitary efforts.",
	"Eeew.  You stink.  When was the last time you showered and changed your underwear?",
	"You think you\'re so smart.\n\n  Hah!\n\nThis error is existence proof of your stupidity.",
	"Incompetents like you often are unaware of their own incompetence.",
	"Computers may be just crystal and wire, but you are barely"+
			" smarter than rocks.",
	"Your neighbors think you\'re strange.",
	"Your simian brow reveals your intellect.",
	"Half of all people have IQs of 100 or less.  You are one of them.",
	"Your coworkers make jokes about your sexual dysfunction.",
	"If you paid someone to teach you to program, ask for your money back.",
	"If you had just worked harder in school, you would gone to a better "+
			"college, \ngotten a better job, and be making lots more money.",
	"Everyone knows what perverted thoughts you have.",
	"When are you going to stop making the same stupid mistakes?",
	"Golf is a game for people who enjoy frustration.  You\'d like golf.",
	"Your mother wasn\'t sleeping with your father when you were conceived.\n"+
			"I thought you\'d like to know.",
	"People who get lots of money and sex deserve it.  You don\'t.",
	"Fish would make good pets for someone with your personality.",
	"Oh?  So you don\'t like epithets with your error messages?\n"+
			"  Don\'t read them!",
	"Obviously you are not smart enough to write using BLESS.",
	"Go home.\nGo home.\nGo home.\nGo home.\nGo home.\nGo home.\n"+
			"Go home.\nGo home.\nGo home!  How many times must I tell you?\n",
	"Have you noticed how people stop talking when you enter a room?",
	"Everybody knows that your body is flabby because you eat too much \n"+
			"and exercise too little.  You choose your fitness level.",
	"Everybody knows you\'re paranoid and loves to play tricks on you.",
	"People laugh about your social ineptitude.",
	"Your secret is common knowledge.",
	"If there is an error, then you caused it, not me. ",
	"When are you going to give up?",
	"The reason you\'re unappreciated, is that you\'re inconsequential.",
	"Ignorance is curable; stupidity is not.  You're incurable.",
	"You make a bag of hammers look sharp.",
	"Go get some vigorous exercise.  Your flabby body needs it.",
  "Your daughters will grow up to be strippers.",
  "Why are you toiling-away the prime years of your life\n"+
  	"when you could be playing or relaxing?",
  "Banality in cookie functions makes them worthless.\n"+
  	"Bombastic error messages were meant to amuse and motivate myself.\n"+
  	"There are many taunting challenges seen only during tool development.\n"+
  	"I intend, dear "+System.getProperty("user.name")+", for some of the taunting\n"+
  	"to hit close to home, provoking reflection motivating virtuous action.\n"+
  	"\n\n  --Br"+"ian Ral"+"ph L"+"ars"+"on, Ch"+"rist"+"mas Da"+"y, 2"+"009\n\n",
  "Be grateful if you get a helpful special hint. It's better than just a call stack.\n"+
  "Somebody wrote code they didn\'t need to so you could get a special hint, because they love you.",
  "It\'s "+Time.todayString+" go home to bed."
	};	//end of epithet

  public static String[] 
kind = new String[]    //fool names
{
   "really-nice person", 
    "kind, considerate person",
    "wonderful person",
    "programmer of the week",
    "winner",
    "champion",
    "perseverer",
    "sage",
    "computer genius"
};  //end  of kind

public static String[] 
idiot = new String[]    //fool names
{
	"fool",
	"idiot",
	"dunderhead",
	"sitzenplinker",
	"dope",
	"dufus",
	"dunce",
	"weak-minded",
	"soft-headed",
	"dumb-ass",
	"tomfool",
	"wiseacre",
	"simpleton",
	"nit-wit",
	"witling",
	"dizzard",
	"donkey",
	"ass",
	"ninny",
	"moron",
	"dolt",
	"booby",
	"looby",
	"hoddy-doddy",
	"noddy",
	"nonny",
	"noodle",
	"nizzy",
	"owl",
	"goose",
	"dog",
	"imbecile",
	"gaby",
	"radoteur",
	"nincompoop",
	"badaud",
	"zany",
	"trifler",
	"babbler",
	"niais",
	"oaf",
	"lout",
	"loon",
	"dullard",
	"buzzard",
	"numps",
	"tony",
	"numskull",
	"shallow-brain",
	"half-wit",
	"dunder-pate",
	"fat-head",
	"sot",
	"un sot a triple etage",
	"sciolist",
	"dabbler",
	"charlatan",
	"greenhorn",
	"tyro",
	"lubber",
	"sophist",
	"hedonist",
	"sinner",
	"cuckold"
	};
							
	
	public static boolean hintAlreadyGiven = false;
	
	
	public static void
	giveHint()
		{
			if (!hintAlreadyGiven)
				{
					//choose random epithet
					Long time = Long.valueOf(System.currentTimeMillis());
					int curse = time.intValue()%10001;	
					if (curse<0) curse = -curse;	
					Global.dumpToSystemOutToo = true;
					Dump.it("\n"+getIdiot()+"\n");
//					else
//						Dump.it("curse="+Integer.toString(curse));	
					//give hint?
					int h = time.intValue()%100;
					if (h<0) h = -h;
					if (h<HelpfulHints.hint.length) Dump.it(HelpfulHints.hint[h]);
					hintAlreadyGiven = true;
				}
		}	

	public static String
getIdiot()	
		{
		Long time = Long.valueOf(System.currentTimeMillis());
		if (!ConfigurationPreferencePage.useEpithet())
		  {
	    int i = time.intValue()%HelpfulHints.kind.length;  
	    if (i<0) i = -i;  
	    return HelpfulHints.kind[i];
		  }
		else
		  {
		  int i = time.intValue()%HelpfulHints.idiot.length;	
		  if (i<0) i = -i;	
		  return HelpfulHints.idiot[i];
		  }
		}
	
}	//end of HelpfulHints