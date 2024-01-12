package com.legonego.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ChatMessage {
    private long no;
    private MessageType type;
    private String roomId;
    private String sender;
    private String message;
    private String resdate;
}
