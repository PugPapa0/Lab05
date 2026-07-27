// PARTNER NAME: Travis Becker
// PARTNER NAME:
// CS111 SECTION #: 05
// DATE: 06/27/26

public class Main
{
	public static void main(String[] args)
	{
		// ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
		final String ASCII_ART_0 = "    .----.    .----.     ",
				ASCII_ART_1 = "   (  --  \\  /  --  )    ",
				ASCII_ART_2 = "          |  |           ",
				ASCII_ART_3 = "         _/  \\_          ",
				ASCII_ART_4 = "        (_    _)         ",
				ASCII_ART_5 = "     ,    `--`    ,      ",
				ASCII_ART_6 = "     \\'-.______.-'/      ",
				ASCII_ART_7 = "      \\          /       ",
				ASCII_ART_8 = "       '.--..--.'        ",
				ASCII_ART_9 = "         `\"\"\"\"\"`         ",
				ASCII_CREDIT = " ascii art by: jgs    ";

		final String TITLE_USA = "UNITED STATES OF AMERICA",
				TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";

		final String LABEL_SURNAME = "Surname",
				LABEL_GIVEN_NAME = "Given Name",
				LABEL_USCIS_NUM = "USCIS#",
				LABEL_CATEGORY = "Category",
				LABEL_CARD_NUM = "Card#",
				LABEL_BIRTH_COUNTRY = "Country of Birth",
				LABEL_TERMS_CONDITIONS = "Terms and Conditions",
				LABEL_BIRTH_DATE = "Date of Birth",
				LABEL_SEX = "Sex",
				LABEL_VALID_DATE = "Valid From:",
				LABEL_EXPIRE_DATE = "Card Expires:",
				LABEL_REENTRY_DISCLAIMER = "NOT VALID FOR REENTRY TO U.S.";

		// DATA VARIABLES
		String surname;
		String givenName;
		String category;
		String cardNum;
		String birthCountry;
		String termsAndConditions;
		char sex;

		String birthMonth;

		int uscisNum1;
		int uscisNum2;
		int uscisNum3;

		int birthDay;
		int birthYear;

		int validDay;
		int validMonth;
		int validYear;

		int expireDay;
		int expireMonth;
		int expireYear;

		String uscisNum;
		String dateOfBirth;
		String validDate;
		String expireDate;

		// INITIALIZATION
		surname = "CHAPETON-LAMAS";
		givenName = "NERY";
		category = "C09";
		cardNum = "SRC9876543210";
		birthCountry = "Guatemala";
		termsAndConditions = "None";
		sex = 'M';

		birthMonth = "JAN";

		uscisNum1 = 12;
		uscisNum2 = 4;
		uscisNum3 = 789;

		birthDay = 1;
		birthYear = 1970;

		validDay = 2;
		validMonth = 2;
		validYear = 2020;

		expireDay = 2;
		expireMonth = 2;
		expireYear = 2022;

		// FORMATTING
		uscisNum = String.format("%03d-%03d-%03d",
				uscisNum1, uscisNum2, uscisNum3);

		dateOfBirth = String.format("%02d %s %d",
				birthDay, birthMonth, birthYear);

		validDate = String.format("%02d/%02d/%d",
				validMonth, validDay, validYear);

		expireDate = String.format("%02d/%02d/%d",
				expireMonth, expireDay, expireYear);


		// OUTPUT SECTION

		System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
		System.out.println("║           UNITED STATES OF AMERICA                                   ║");
		System.out.println("║                               EMPLOYMENT AUTHORIZATION CARD          ║");

		System.out.println("║                         Surname                                      ║");
		System.out.println("║                         " + surname + "                               ║");

		System.out.println("║" + ASCII_ART_0 + LABEL_GIVEN_NAME + "                                   ║");
		System.out.println("║" + ASCII_ART_1 + givenName + "                                         ║");

		System.out.println("║" + ASCII_ART_2 + LABEL_USCIS_NUM + "       "
				+ LABEL_CATEGORY + "       " + LABEL_CARD_NUM + "            ║");

		System.out.println("║" + ASCII_ART_3 + uscisNum + "  "
				+ category + "            " + cardNum + "    ║");

		System.out.println("║" + ASCII_ART_4 + LABEL_BIRTH_COUNTRY + "                             ║");
		System.out.println("║" + ASCII_ART_5 + birthCountry + "                                    ║");

		System.out.println("║" + ASCII_ART_6 + LABEL_TERMS_CONDITIONS + "                         ║");
		System.out.println("║" + ASCII_ART_7 + termsAndConditions + "                                         ║");

		System.out.println("║" + ASCII_ART_8 + LABEL_BIRTH_DATE
				+ "     " + LABEL_SEX + "                        ║");

		System.out.println("║" + ASCII_ART_9 + dateOfBirth
				+ "         " + sex + "                        ║");

		System.out.println("║                         " + LABEL_VALID_DATE
				+ "    " + validDate + "                    ║");

		System.out.println("║                         " + LABEL_EXPIRE_DATE
				+ "  " + expireDate + "                    ║");

		System.out.println("║" + ASCII_CREDIT
				+ LABEL_REENTRY_DISCLAIMER + "                   ║");

		System.out.println("╚══════════════════════════════════════════════════════════════════════╝");
	}
}