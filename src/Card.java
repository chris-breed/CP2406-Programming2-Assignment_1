class Card {

    String fileName;
    String imageName;
    String card_type;
    String title;
    String chemistry;
    String classification;
    String crystalSystem;
    String[] occurrence; //4 options: igneous, metamorphic, sedimentary and mantle
    int hardness;   //1 to 10 scale
    float specificGravity;   //grams per cubic cm
    String cleavage;    //eg (1 perfect, 2 poor) means the mineral has 1 perfect plane and 2 poor planes
    String crustalAbundance;    //lowest to highest: ultratrace, trace, low, moderate, high, very high
    String economicValue;   //lowest to highest: trivial, low, moderate, high, very high, I'm rich!


    public Card(String fileName, String imageName, String cardType, String title, String chemistry, String classification,
                String crystalSystem, String[] occurrence, int hardness, float specificGravity, String cleavage,
                String crustalAbundance, String economicValue) {
        this.fileName = fileName;
        this.imageName = imageName;
        this.card_type = cardType;
        this.title = title;
        this.chemistry = chemistry;
        this.classification = classification;
        this.crystalSystem = crystalSystem;
        this.occurrence = occurrence;
        this.hardness = hardness;
        this.specificGravity = specificGravity;
        this.cleavage = cleavage;
        this.crustalAbundance = crustalAbundance;
        this.economicValue = economicValue;
    }

    public String printFileName() {
        return this.imageName;
    }

}