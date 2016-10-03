class Card {

    //fields
    String fileName;
    String imageName;
    String card_type;
    String title;
    String chemistry;
    String classification;
    String crystalSystem;
    String occurrence; //4 options: igneous, metamorphic, sedimentary and mantle
    String hardness;   //1 to 10 scale - convert when to int when needed
    String specificGravity;   //grams per cubic cm - convert to float when needed
    String cleavage;    //eg (1 perfect, 2 poor) means the mineral has 1 perfect plane and 2 poor planes
    String crustalAbundance;    //lowest to highest: ultratrace, trace, low, moderate, high, very high
    String economicValue;   //lowest to highest: trivial, low, moderate, high, very high, I'm rich!

    //constructor
    public Card(String[] cardValues){
        this.fileName = cardValues[0];
        this.imageName = cardValues[1];
        this.card_type = cardValues[2];
        this.title = cardValues[3];
        this.chemistry = cardValues[4];
        this.classification = cardValues[5];
        this.crystalSystem = cardValues[6];
        this.occurrence = cardValues[7];
        this.hardness = cardValues[8];
        this.specificGravity = cardValues[9];
        this.cleavage = cardValues[10];
        this.crustalAbundance = cardValues[11];
        this.economicValue = cardValues[12];
    }
}