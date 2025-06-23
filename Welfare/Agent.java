public class Agent {
    private String name;
    private Long generatedFund;

    public Agent(String name, Long generatedFund) {
        this.name = name;
        this.generatedFund = generatedFund;
    }

    public String getName() {
        return name;
    }

    public Long getGeneratedFund() {
        return generatedFund;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGeneratedFund(Long generatedFund) {
        this.generatedFund = generatedFund;
    }
}
