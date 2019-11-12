package com.prafull.poc.springcloud.service.message.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_message")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false, unique = true)
    private Integer id;
    @Column(name = "user_name", nullable = false, unique = true)
    @NonNull
    private String userName;
    @Column(name = "user_message")
    @NonNull
    private String userMeesage;


}
