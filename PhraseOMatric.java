package love;

public class PhraseOMatric {
	public static void main(String[] args){
		//make three sets of words to chose from. add your own string!
		String[] wordListone = {" 24/7 "," multi-Tire "," 3000- Foot "," B-to-B "," win-win "," front-end "," web-based "," pervasive "," smart "," six-sigma "," critical-path "," dynamic "};
		String[] wordListtwo = {" empowered "," sticky "," value-added "," oriented "," centric "," distributed "," clustered "," branded "," outside-the-box "," postition "," networked "," focused "," leveraged "," alligned "," targeted "," shared "," coperative "," accelerated "};
		String[] wordListthree = {" process "," tripping-point "," solition "," architecture "," core competency "," strategy "," mindshare "," portal "," space "," vision "," paradigm "," mission "};
		//find how many words are there! in each list
		int oneLength = wordListone.length;
		int twoLength = wordListtwo.length;
		int threeLength = wordListthree.length;
		//generate three random number
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		//now build a phase
		String phrase = wordListone[rand1] + "" + wordListtwo[rand2] + "" + wordListthree[rand3];
		// print out the phase
		System.out.print("what we need is a " + phrase);
		}


}
