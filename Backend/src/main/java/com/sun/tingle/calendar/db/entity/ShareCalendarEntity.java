package com.sun.tingle.calendar.db.entity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="calendar_share")
public class ShareCalendarEntity {


    @Id
    @Column(name = "share_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 생성을 db에 위임하는 방법(auto increment)
    private Long shareId;


    @Column(name="calendar_code")
    private String calendarCode;

    @Column(name="member_id")
    private String memberId;


}
