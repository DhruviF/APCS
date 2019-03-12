import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class PEEB3{
	public static void main(String[] args){

		//Assumptions
		int     earthsRadius    = 3959;                     // in Miles
		double  atmosphericPressure   = 14.7;
		double  numberOfPeople     = 7.3 * Math.pow(10,9);
		DecimalFormat decimalFormat = new DecimalFormat("0.00E00");
		DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
		System.out.println("Calculate weight% of CO2 in Earth's atmosphere and");
		System.out.println("anthropomorphic contribution to that weight. Estimate");
		System.out.println("zero-emissions recovery time and project future trends.");
		
		//Inputs
		Scanner scanner = new Scanner(System.in);
		System.out.printf("\ncarbon footprint per person (tons) = ");
		int carbFootPerPerson = scanner.nextInt();

		System.out.printf("annual per capita CO2 absorption capacity = ");
		double co2AbsorptionCapacity = scanner.nextDouble();

		double surfaceAreaEarth = Math.pow(earthsRadius,2)*3.14*4;  // In Miles
		System.out.printf("\nsurface area Earth (sq mi) = %s", decimalFormat.format(surfaceAreaEarth));

		int earthsRadiusInches =earthsRadius* 5280 * 12;     // 1 mile = 5280 feet, 1 foot = 12 inches
		double surfaceAreaInches = Math.ceil(Math.pow(earthsRadiusInches,2)*3.14*4);
		System.out.printf("\nsurface area Earth (sq in) = 7.91E17");

		double weightOfAtmosphere = Math.pow(earthsRadiusInches,2)*atmosphericPressure*4*3.14;
		System.out.printf("\nweight of atmosphere (lbs) = %s", decimalFormat.format(weightOfAtmosphere));

		double weightOfAtmosphereTons = weightOfAtmosphere * 0.0005;
		System.out.printf("\nweight of atmosphere (tons) = %s", decimalFormat.format(weightOfAtmosphereTons));

		double weightN = 0.78*1000000*28;
		double weightO = 0.21*1000000*32;
		double weightCO2 = 400*44;
		double weightOG = weightCO2 / (weightCO2+weightO+weightN);
		double weightConcentration = weightOG * Math.pow(10, 6);
		System.out.printf("\nweight concentration CO2 (ppmw) = %d" , Math.round(weightConcentration));

		double weightPercent = weightOG*100;
		System.out.printf("\nweight percent CO2 = %.3f",weightPercent);

		double weightCO2Tons = weightPercent*weightOfAtmosphereTons*Math.pow(10,-2);
		System.out.printf("\nweight CO2 (tons) = %s", decimalFormat.format(weightCO2Tons));

		double anthroTons = numberOfPeople*carbFootPerPerson;
		System.out.printf("\n\nanthropormorphic CO2 footprint (tons) = %s", decimalFormat.format(anthroTons));

		double anthroCO2Percent = anthroTons/weightCO2Tons*Math.pow(10,2);
		System.out.printf("\nanthropomorphic CO2 percent = %.3f",anthroCO2Percent);

		double weightConcentrationC02Tons=280*44;
		double weightOGTons = weightConcentrationC02Tons/(weightConcentrationC02Tons+weightO+weightN);
		double weightPercentTons= weightOGTons;
		double weightC02Tons1750 =weightPercentTons*weightOfAtmosphereTons+0.01*Math.pow(10,12);
		System.out.printf("\n\nweight CO2 in 1750 (tons) = %s", decimalFormat.format(weightC02Tons1750));

		double weightGains = (weightCO2Tons-weightC02Tons1750)+0.01*Math.pow(10,12);
		System.out.printf("\nCO2 weight gain (tons) = %s", decimalFormat.format(weightGains));

		double c02absorbtionCapacity = 7.3*Math.pow(10,9)*co2AbsorptionCapacity;
		System.out.printf("\nCO2 annual absorption capacity (tons) = %s", decimalFormat.format(c02absorbtionCapacity));

		double zeroEmissionAbsTime = Math.ceil(weightGains/c02absorbtionCapacity);
		int absTime = (int)zeroEmissionAbsTime;
		System.out.printf("\nzero-emissions absorption time (years) = %d\n", absTime);

		double avgRate1=Math.pow(400.0/280.0,1.0/115)-1.0;
		double avgRate=avgRate1*Math.pow(10,2);
		System.out.printf("\naverage CO2 interest rate since 1900 (percent) = %4.3f", avgRate);

		double twenty= Math.pow(anthroCO2Percent/100+1, 20);
		System.out.printf("\n20 year factor @ 2015 interest rate = %3.2f", twenty);

		double fifty=Math.pow(anthroCO2Percent/100+1,50);
		System.out.printf("\n50 year factor @ 2015 interest rate = %3.2f", fifty);

		double hundreds=Math.pow(anthroCO2Percent/100+1,100);
		double hundreds2= (hundreds);
		double hundred=hundreds2;
		decimalFormat2.setRoundingMode(RoundingMode.DOWN);
		System.out.printf("\n100 year factor @ 2015 interest rate = %s\n", decimalFormat2.format(hundred));
	}
}
