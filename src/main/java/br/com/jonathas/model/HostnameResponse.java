package br.com.jonathas.model;


import java.time.LocalDateTime;

public class HostnameResponse {

    private String hostname;
    private LocalDateTime dateLocalTime;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public LocalDateTime getDateLocalTime() {
        return dateLocalTime;
    }

    public void setDateLocalTime(LocalDateTime dateLocalTime) {
        this.dateLocalTime = dateLocalTime;
    }
}
