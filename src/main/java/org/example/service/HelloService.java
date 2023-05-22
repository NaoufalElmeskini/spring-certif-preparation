package org.example.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public void hello() {
        String destinataire = this.getDestinataire();
        System.out.println("hello " + destinataire);
    }

    private String getDestinataire() {
        return "Mom";
    }
}
