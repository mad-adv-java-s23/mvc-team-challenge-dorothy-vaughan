package java112.servlet;

/**
 * The MadLibsBean for creating Madlib game
 * 
 * @author Shilpa Handa
 */
public class MadLibsBean {
    private String name;
    private String noun;
    private String verb;
    private String adjective;
    private String adverb;
    
    
    /**
     * gets the name for malib
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name for madlib
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * return the adverb for madlib
     * @return
     */
    public String getAdverb() {
        return adverb;
    }

    /**
     * set the adverb for game
     * @param adverb
     */
    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    /**
     * sets the noun for game
     * @param noun
     */
    public void setNoun(String noun) {
        this.noun = noun;
    }

    /**
     * sets the verb for game
     * @param verb
     */
    public void setVerb(String verb) {
        this.verb = verb;
    }

    /**
     * sets the adjective for game
     * @param adjective
     */
    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    /**
     * gets the noun for game
     * @return
     */
    public String getNoun() {
        return noun;
    }

    /**
     * gets the verb for game
     * @return
     */
    public String getVerb() {
        return verb;
    }

    /**
     * gets the adjective for game
     * @return
     */
    public String getAdjective() {
        return adjective;
    }

    // returns the story for game
    public String getStory() {
        String story = "Once upon a time, there was a " + noun + " named " + name + ". " +
                name + " loved to " + verb + " " + adverb + " and " + adjective + " things. " +
                "One day, " + name + " found a magic lamp and a genie appeared. " +
                "The genie granted " + name + " three wishes, but " + name + " used them all " +
                "to wish for more " + adjective + " and " + adverb + " things.";
        return story;
    }
}