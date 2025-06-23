import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Agent> agentList = new ArrayList<>();

        System.out.print("Enter number of agents: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter generated fund: ");
            Long fund = sc.nextLong();
            sc.nextLine();

            agentList.add(new Agent(name, fund));
        }

        Map<String, String> gradedAgents = agentList.stream().collect(
            Collectors.toMap(
                Agent::getName,
                agent -> {
                    long fund = agent.getGeneratedFund();
                    if (fund >= 2000000) return "*****";
                    else if (fund >= 1500000) return "***";
                    else if (fund >= 1000000) return "*";
                    else return "";
                }
            )
        );

        gradedAgents.forEach((name, grade) -> System.out.println(name + "=" + grade));
    }
}
