package com.example.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long advisorId;

    private String advisorName;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public Advisor(Long advisorId, String advisorName, String email, String phone, List<Client> clients) {
        this.advisorId = advisorId;
        this.advisorName = advisorName;
        this.email = email;
        this.phone = phone;
        this.clients = clients;
    }

    public Long getAdvisorId() { return advisorId; }

    public String getAdvisorName() { return advisorName; }
    public void setAdvisorName(String advisorName) { this.advisorName = advisorName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
