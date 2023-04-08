package java112.servlet;

public class MadLibsBean {
    private String noun;
    private String verb;
    private String adjective;
    
    /**
     * @param noun
     */
    public void setNoun(String noun) {
        this.noun = noun;
    }

    /**
     * @param verb
     */
    public void setVerb(String verb) {
        this.verb = verb;
    }

    /**
     * @param adjective
     */
    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    /**
     * @return
     */
    public String getNoun() {
        return noun;
    }

    /**
     * @return
     */
    public String getVerb() {
        return verb;
    }

    public String getAdjective() {
        return adjective;
    }
}
