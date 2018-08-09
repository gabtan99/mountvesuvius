/**
* The class <b>Random</b> is imported to be used for generating a number for product produced.
*/
import java.util.Random;
/**
* public class <b>Vegetable/B>
* implements <b>Seed</B>
*
* The class Vegetable as inherited from the Seed class
*
* <p>
* This class is used to specifically differentiate a specific type of seed, a Vegetable in this case
*
* @author  Gabriel T. Tan & Adrian Paule D. Ty
* @version 1.0
* @since   2018-08-15
* @see         Seed
* @see         FruitTree
* @see         Flower
*/
public class Vegetable extends Seed
{
	private int productsMin;
	private int productsMax;

	/**
 	* A constructor for objects of Vegetable class; calls the Constructor of the the Seed class
	* <p>
	* This class has two additional class variables namely <i>productsMin</i> and <i>productsMax</i>.
	* <i>productsMin</i> refers to the minimum amount an object of this class can generate.
	* <i>productsMax</i> refers to the maximum amount an object of this class can generate.
	*
 	* @param  n  a String referring to the name of the seed
 	* @param  tn a double value referring to the time needed of the seed to grow, in mintues
	* @param  wn  an integer value referring to the amount of water needed for a plant to grow
 	* @param  wm an integer value referring to the maximum amount of water a plant can receive for bonus computation
	* @param  fn  an integer value referring to the amount of fertilzier needed for a plant to grow
 	* @param  fm an integer value referring to the maximum amount of fertilizer a plant can receive for bonus computation
	* @param  hc  a double value referring to the harvest cost of the seed
 	* @param  sc a double value referring to the cost of buying a seed
	* @param  bp  a double value referring to the base selling price of a
	* @param  min a double value referring to the minimum amount of products a seed can produce
	* @param  max  a double value referring to the maximum amount of products a seed can produce
	* @see         Seed
 	* @see         FruitTree
	* @see         Flower
 	*/
	public Vegetable( String n, double tn, int wn, int wm, int fn, int fm, double hc, double sc, double bp, int min, int max)
	{
		super(n, tn, wn, wm, fn, fm, hc, sc, bp);

		productsMin = min;
		productsMax = max;
	}

	/**
	* Returns a string of text containing the Vegetable's information
	*
	* <p>
	* This method calls several getter methods from the Seed class.
	* The string is formatted in such a way that it makes displaying information easier in the View class
	* @return	a string representation of the Vegetable's information
	*/
	public String displayStats()
	{
		String display = "";

		display = display + "  Vegetable: " + super.getName() + "   Owned: " + getQuantity() + "\n";
		display = display + "  Growth: " + (int)(super.getTN()) + " minutes and "+ ( super.getTN() - (int)(super.getTN()) ) * 60 + " seconds \n";
		display = display + "  Water Needs (min/max): " + super.getWN() + "/" + super.getWM() +  " \n";
		display = display + "  Fertilizer Needs (min/max): " + super.getFN() + "/" + super.getFM()+  ")\n";
		display = display + "  Seed Cost: " + super.getSC() + " \n";
		display = display + "  Harvest Cost: " + super.getHC() + "\n";
		display = display + "  Base Selling Price: " + super.getBP() + "\n";
		display = display + "  Produce (min - max): " + productsMin + " - " + productsMax;

		return display;


	}


	/**
 	* A method inherited from the Seed class
	* <p>
	* This method instantiates an instance of <i>Random</i> to generate a number between the vegetable's <i>productsMin</i> and <i>productsMax</i>.
	*
	* @return	an integer randomly generated by the Random class between <i>productsMin</i> and <i>productsMax</i>
 	*/
	public int productsProduced()
	{
		Random rand = new Random();

		return rand.nextInt(productsMax - productsMin + 1) + productsMin;
	}

}
