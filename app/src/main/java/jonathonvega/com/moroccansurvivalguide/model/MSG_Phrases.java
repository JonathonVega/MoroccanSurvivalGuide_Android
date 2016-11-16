package jonathonvega.com.moroccansurvivalguide.model;

/**
 * Created by jonathonfvega on 10/22/16.
 */
public class MSG_Phrases {

    public Section[] phraseList;

    public MSG_Phrases(){
        phraseList = new Section[11];

        phraseList[0] = new Section("Greetings",
                new String[][]{
                        {"Hello", "Salam"},
                        {"Hello", "Salamu 3alikum"},
                        {"How are you", "Labas"},
                        {"How are you doing", "Kidayr/a"},
                        {"What\'s up", "Ash Khabarak"},
                        {"How are you doing", "Keef Dayr/a"},
                        {"What\'s going on","Ash t3awwd/i"},
                        {"How\'s Everything?", "Kolshee Labas"},
                        {"How\'s Everything", "Kolshee Bekheer"},
                        {"It\'s fine", "Labas"},
                        {"Fine, Thank God", "L\'hamdollah"}});

        phraseList[1] = new Section("Family",
                new String[][]{
                        {"Mom", "Mmi"},
                        {"Dad", "Bba"},
                        {"Sister", "Okht"},
                        {"Brother", "Kho"},
                        {"Aunt(paternal)", "3amma"},
                        {"Aunt(maternal", "Khala"},
                        {"Uncle(paternal)", "3amm"},
                        {"Uncle(maternal)", "Khaal"},
                        {"Cousin(paternal)", "Wld a3m/bnt a3m"},
                        {"Cousin(maternal)", "Wld khal/bnt khal"},
                        {"Wife", "Mra"},
                        {"Husband", "Zawj/rajol"},
                        {"Fiancé", "Khateeb"},
                        {"Girl", "Bnt"},
                        {"Boy", "Wld"},
                        {"Man", "Rajol"},
                        {"Woman", "Mra"},
                        {"Grandmother", "Jdda"},
                        {"Grandfather", "Jdd"},
                        {"Grandchild", "Hafeed"}});

        phraseList[2] = new Section("House",
                new String[][]{
                        {"Door", "Bab"},
                        {"Floor", "Ard"},
                        {"Bathroom", "Banyo/L\'hammam"},
                        {"Shower", "Douche"},
                        {"Refrigerator", "Tllaja"},
                        {"Table", "Tabla"},
                        {"Stove", "Forno"},
                        {"Faucet", "Robini"},
                        {"Window", "Sharjam"},
                        {"Couch", "Ponj"},
                        {"Chair", "Korsi"},
                        {"Bed", "Frash"},
                        {"Stairs", "Dorjj"},
                        {"Light", "Do2"},
                        {"Outlet", "Preez"},
                        {"Television", "Talfaza"}});

        phraseList[3] = new Section("Street",
                new String[][]{
                        {"Street", "Zn9a"},
                        {"Road/Highway","Tre9"},
                        {"Corner", "9ent"},
                        {"Car", "Tomobil"},
                        {"House", "Dar"},
                        {"Place", "Blasa"},
                        {"Bike", "Pikala"},
                        {"Motorcycle", "Motor"},
                        {"Street Vendor", "Ba2i3 Motajowwil"},
                        {"Parking", "L\'Parking"},
                        {"Parking Service", "L\'a3ssas"},
                        {"Market", "Souk"},
                        {"Building", "3emara"},
                        {"Grocery Store", "Hanout"},
                        {"Pharmacy", "Saydalia"},
                        {"School", "Scuela"},
                        {"Police Station", "Commisaria"},
                        {"Embassy", "Ssifara"},
                        {"Tram Station", "MahTa d L\'Tram"},
                        {"Train Station", "La gare"},
                        {"Taxi", "Taksi"}});

        phraseList[4] = new Section("Food",
                new String[][]{
                        {"Restaurant", "Ristorant"},
                        {"Food", "Makla"},
                        {"Alcohol", "Shrab"},
                        {"Bar", "Cabaray"},
                        {"Café", "9hiwa"},
                        {"Tajine", "Tajine"},
                        {"Soup", "Sopa"},
                        {"Plate", "Tbsil"},
                        {"Dish", "Okla"},
                        {"Snack", "Okla Khafifa"},
                        {"Orange Juice", "3asir Limon"},
                        {"Coffee", "9hiwa"},
                        {"Water", "L\'ma2"},
                        {"Water Bottle", "9r3 d l\'ma2"},
                        {"Cake", "Keeka"},
                        {"Grill", "Shwaya"},
                        {"Corn", "L\'kbbal"},
                        {"Snails", "Ghalala"},
                        {"Fork", "Forschetta"},
                        {"Spoon", "Ma3l9a"},
                        {"Knife", "Mos"},
                        {"Napkin", "Sirbeta"},
                        {"Cups", "Keesan"}});

        phraseList[5] = new Section("Numbers",
                new String[][]{
                        {"One", "Wa7d"},
                        {"Two", "Jouj"},
                        {"Three", "Tlata"},
                        {"Four", "Arba3"},
                        {"Five", "Khamsa"},
                        {"Six", "Stta"},
                        {"Seven", "Sb3a"},
                        {"Eight", "Tmaniya"},
                        {"Nine", "Tss3oud"},
                        {"Ten", "A3chra"},
                        {"Eleven", "7dach"},
                        {"Twelve", "Thnash"},
                        {"Thirteen", "Thltash"},
                        {"Fourteen", "Arba3tash"},
                        {"Fifteen", "Khamstach"},
                        {"Sixteen", "Sttash"},
                        {"Seventeen", "Sba3tash"},
                        {"Eighteen", "Tmntach"},
                        {"Nineteen", "Ts3atash"},
                        {"Twenty", "3ashriin"},
                        {"Twenty-one", "W7d w a3shriin"},
                        {"30", "Tlatin"},
                        {"40", "Arb3iin"},
                        {"50", "Khamsiin"},
                        {"60", "Sttiin"},
                        {"70", "Sb3iin"},
                        {"80", "Tmaniin"},
                        {"90", "Ts3iin"},
                        {"100", "Mia"},
                        {"200", "Mitin"},
                        {"1,000", "Alf"},
                        {"1,000,000", "Milion"},
                        {"1,000,000,000", "Miliar"}});

        phraseList[6] = new Section("Money",
                new String[][]{
                        {"Money", "Flous"},
                        {"Country Currency", "Dirham (dh)"},
                        {"1 USD", "10 dh"},
                        {"10 USD", "100 dh"},
                        {"100 USD", "1000 dh"},
                        {"1000 USD", "10000 dh"}});

        phraseList[7] = new Section("Cities/Sites",
                new String[][]{
                        {"City", "Madina"},
                        {"Old Town", "L\'medina"},
                        {"Village", "9ariya"},
                        {"Town", "Blda"},
                        {"River", "Wad"},
                        {"Downtown", "Centre Ville"},
                        {"Neighborhood", "Hay"},
                        {"Beach", "L\'bahr"},
                        {"Pool", "La Piscine"},
                        {"Mountains", "Jbal"},
                        {"Desert", "Sahra2"},
                        {"Country", "Bled"},
                        {"North", "Shamal"},
                        {"South", "Janoub"},
                        {"Atlas", "Atlasi"},
                        {"Forest", "Ghaba"}});

        phraseList[8] = new Section("Shopping",
                new String[][]{
                        {"To Shop", "T9adda"},
                        {"Market", "Swi9a"},
                        {"Old town", "Medina"},
                        {"Clothes", "7waije"},
                        {"Thobe", "Djellaba"},
                        {"Traditional Mens Shirt", "Jabador"},
                        {"Traditional Shoes", "Belgha"},
                        {"Hat", "Taggiya"},
                        {"Sandals", "Sandalia"},
                        {"Shirt", "9amija"},
                        {"Jeans/Pants", "Sirwal"},
                        {"Shoes/Dress Shoes", "Sbbat"},
                        {"Shoes(ordinary)", "Sbirdeela"},
                        {"Socks", "T9ahir"},
                        {"Necklace", "Sensla"},
                        {"Jewelry", "Mojawharat"},
                        {"Shop Owner", "Moul hanout"},
                        {"What do you need", "Ach habbat l\'khatar"},
                        {"Price", "Thaman"},
                        {"Give me a good price", "Sawb ma3aya taman"},
                        {"Expensive", "Ghali"},
                        {"I cannot afford it", "Ma mselkash"},
                        {"No", "La"},
                        {"Yes", "Ayeh"},
                        {"A little bit", "Shwiya"},
                        {"No thanks, Bye!", "Allah y3awnik"},
                        {"That\'s it", "Safi"}});

        phraseList[9] = new Section("Useful Questions",
                new String[][]{
                        {"Where is...", "Feen..."},
                        {"What time is it?", "Ch7al f Sa3a"},
                        {"Where are you from?", "Minin nta?"},
                        {"How old are you", "Ch7al f omrek"},
                        {"Where are we going?", "Feen Ghadiin"},
                        {"What are you doing?", "Achno katdeer"},
                        {"How is...(name) doing?", "Kidayr...(name)"},
                        {"Who are you?", "Chkoon nta?"},
                        {"Who is that?", "Chkoon hada"},
                        {"When", "Imta"},
                        {"When(What time)?","Wa9tash"},
                        {"Why?", "3alache"},
                        {"How?", "Kifache"},
                        {"How much(size)?", "Giddach"},
                        {"There is...", "Kayn"},
                        {"Help me", "A3wnni"},
                        {"Please", "A3fak"},
                        {"Call", "3eyt 3ala"}});

        phraseList[10] = new Section("Useful Expressions",
                new String[][]{
                        {"Thank you", "Chokran"},
                        {"You\'re Welcome", "La Chokr 3la Wajb"},
                        {"Get out of my face", "Drrg a3liya dzalftk"},
                        {"Move away from me", "Ba3d mnni"},
                        {"Run away", "A3ll9"},
                        {"Money", "3omar"},
                        {"Food", "L\'9as"},
                        {"Food", "L\'mo3alaja"},
                        {"Food", "Tkiya"},
                        {"People", "Bnadem"},
                        {"Fun", "Tfwija"},
                        {"Weird", "F shi shkl"},
                        {"What\'s up?", "Wesh"},
                        {"Whats good?", "Wa feen"},
                        {"Foreigner", "Barrani"},
                        {"Neighborhood", "L\'7ouma"},
                        {"Boy/Dude", "Sat"},
                        {"Girl", "Satta"},
                        {"Friendship", "3achran"},
                        {"Friend", "3achir"},
                        {"Go", "9alla3"}
                }
        );
    }

    public Section[] getPhraseList() {
        return phraseList;
    }

    public int getPhraseListCount(Section sectionPhraseList) {
        return sectionPhraseList.getWords().length;
    }
}























