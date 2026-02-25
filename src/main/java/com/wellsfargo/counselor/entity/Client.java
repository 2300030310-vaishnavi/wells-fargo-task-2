
package com.wellsfargo.portfolio.entities;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;

    private String clientName;

    @ManyToOne
    private Advisor advisor;

    @OneToOne(mappedBy = "client")
    private Portfolio portfolio;

    public Client(Long clientId, String clientName, Advisor advisor, Portfolio portfolio) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.advisor = advisor;
        this.portfolio = portfolio;
    }

    public Long getClientId() { return clientId; }

    public String getClientName() { return clientName; }
    public void setClientName(String clientName) { this.clientName = clientName; }

    public Advisor getAdvisor() { return advisor; }
    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }

    public Portfolio getPortfolio() { return portfolio; }
    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
