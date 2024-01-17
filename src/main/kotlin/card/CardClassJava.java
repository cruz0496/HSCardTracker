package card;

public enum CardClassJava {

    DRUID("Druid"),
    MAGE("Mage"),
    HUNTER("Hunter"),
    WARLOCK("Warlock"),
    DEATH_KNIGHT("Death Knight"),
    DEMON_HUNTER("Demon Hunter"),
    PRIEST("Priest"),
    ROGUE("Rogue"),
    PALADIN("Paladin"),
    SHAMAN("Shaman"),
    WARRIOR("Warrior");

    private String prettyName;

    CardClassJava(String prettyName) {
        this.prettyName = prettyName;
    }

    public String getPrettyName() {
        return this.prettyName;
    }
}
