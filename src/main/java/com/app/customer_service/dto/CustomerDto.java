package com.app.customer_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
    private long id;
    private String origin;
    private String destination;
    private String email;

    public CustomerDto(long id, String origin, String destination, String email) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.email = email;
    }

    public CustomerDto() {
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
