package com.StringProgrammes;

public class ConvertWORDtoSTRING {

	public StringBuilder HundredMEthod(int num) {
		StringBuilder sb = new StringBuilder();
		int remainder = num % 1000;
		int extranum = num / 1000;
		
		
		
		
		
		if(extranum>=10 && extranum<=19) {
			String extrthousand = null;
			
			switch (extranum) {
			case 10:
				extrthousand="Ten";
				break;
				
			case 11:
				extrthousand="Eleven";
				break;
				
			case 12:
				extrthousand="Twelve";
				break;
				
			case 13:
				extrthousand="thirteen";
				break;
				
			case 14:
				extrthousand="fourteen";
				break;
			case 15:
				extrthousand="Fifteen";
				break;
			case 16:
				extrthousand="Sixteen";
				break;
			case 17:
				extrthousand="Seventeen";
				break;
			case 18:
				extrthousand="Eighteen";
				break;
			case 19:
				extrthousand="Ninteen";
				break;
				

			default:
				break;
			}
			sb.append(extrthousand);
			sb.append("thousand");
		}
		
		if(extranum>19) {
		int	extra=extranum/10;
		String extrastr = null;
		switch (extra) {
		case 0:
			extrastr=" ";
			break;

		case 1:
			extrastr="one ";
			break;
		case 2:
			extrastr="twenty ";
			break;
		case 3:
			extrastr="thirty ";
			break;
		case 4:
			extrastr=" fourty";
			break;
		case 5:
			extrastr="fifty ";
			break;
		case 6:
			extrastr="sixty ";
			break;
		case 7:
			extrastr="seventy ";
			break;
		case 8:
			extrastr="eightyt ";
			break;
			
		case 9:
			extrastr="ninty ";
			break;
		default:
			break;
		}
		sb.append(extrastr);
		extranum=extranum%10;	
		}
		
		
		if (extranum >=0 && extranum<=9 ) {
			String whichhundred = null;
			
			switch (extranum) {
			case 0:
				whichhundred = " ";
				break;

			case 1:
				whichhundred = " One  ";
				break;
			case 2:
				whichhundred = " Two  ";
				break;
			case 3:
				whichhundred = " Three  ";
				break;
			case 4:
				whichhundred = " Four  ";
				break;
			case 5:
				whichhundred = " Five  ";
				break;

			case 6:
				whichhundred = " Six  ";
				break;
			case 7:
				whichhundred = " Seven  ";
				break;

			case 8:
				whichhundred = " Eight ";
				break;

			case 9:
				whichhundred = " Nine ";
				break;

			default:
				break;
			}
			sb.append(whichhundred);
			sb.append("Thousand");
		}
		
		
		if(remainder>=100 && remainder<=900) {
			String thousandcase = null;
			int finderthousand=remainder/100;
			switch (finderthousand) {
			case 0:
				thousandcase=" ";
				
				break;
			case 1:
				thousandcase=" One ";
				
				break;
			case 2:
				thousandcase=" two ";
				
				break;
			case 3:
				thousandcase=" three ";
				
				break;
			case 4:
				thousandcase=" four ";
				
				break;
			case 5:
				thousandcase=" five ";
				
				break;
			case 6:
				thousandcase=" six ";
				
				break;
			case 7:
				thousandcase=" seven ";
				
				break;
			case 8:
				thousandcase=" eight ";
				
				break;
			case 9:
				thousandcase=" nine ";
				
				break;

			default:
				break;
			}
			sb.append(thousandcase);
			sb.append("hundred");
			remainder=remainder%100;
		}

		if (remainder >= 11 && remainder <= 19) {
			String tensdigit = null;
			int tensdigitnum = remainder / 10;
			
			/*
			 * if(extranum>=10 && extranum<=19) {
			 * 
			 * 
			 * }
			 */
			
			switch (tensdigitnum) {
			case 11:
				tensdigit = " Eleven ";

				break;

			case 12:
				tensdigit = " Twelve ";

				break;
			case 13:
				tensdigit = " Thirteen ";

				break;
			case 14:
				tensdigit = " Fourteen ";

				break;
			case 15:
				tensdigit = " fifteen ";

				break;
			case 16:
				tensdigit = " sixteen ";

				break;
			case 17:
				tensdigit = " seventen ";

				break;
			case 18:
				tensdigit = " eighteen ";

				break;
			case 19:
				tensdigit = " ninteen ";

				break;

			default:
				break;
			}
			sb.append(tensdigit);
		}

		if (remainder > 19) {
			String tensdigit = null;
			int tensdigitnum = remainder / 10;

			switch (tensdigitnum) {
			case 2:
				tensdigit = "twenty ";
				break;
			case 3:
				tensdigit = "thirty ";
				break;
			case 4:
				tensdigit = "fourty ";
				break;
			case 5:
				tensdigit = "fifty ";
				break;
			case 6:
				tensdigit = "sixty ";
				break;
			case 7:
				tensdigit = "seventy ";
				break;
			case 8:
				tensdigit = "eighty ";
				break;
			case 9:
				tensdigit = "Ninty ";
				break;

			default:
				break;
			}
			sb.append(tensdigit);
		}

		if (remainder >= 0 || remainder <= 10) {

			String unitdigit = null;
			int unitremainder = remainder % 10;

			switch (unitremainder) {
			case 0:
				unitdigit = " ";

				break;
			case 1:
				unitdigit = "One ";

				break;
			case 2:
				unitdigit = "Two ";

				break;
			case 3:
				unitdigit = "Three ";

				break;
			case 4:
				unitdigit = "Four ";

				break;
			case 5:
				unitdigit = " Five";

				break;
			case 6:
				unitdigit = "Six ";

				break;
			case 7:
				unitdigit = "Seven ";

				break;
			case 8:
				unitdigit = "Eight ";

				break;
			case 9:
				unitdigit = "Nine ";

				break;
			case 10:
				unitdigit = "Ten ";

				break;

			default:
				break;
			}
			sb.append(unitdigit);
		}

		return sb;

	}

	public static void main(String[] args) {
		ConvertWORDtoSTRING ob = new ConvertWORDtoSTRING();
		int num = 70007;
		StringBuilder inwords = ob.HundredMEthod(num);
		System.out.println(inwords);

	}

}
