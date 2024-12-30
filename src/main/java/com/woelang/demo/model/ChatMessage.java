package com.woelang.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "messages")
public class ChatMessage {
    @Id
    private String id;
    private MessageType type;
    private String content;
    private String sender;
    private String roomId; // 채팅방 구분을 위한 필드 추가 (선택 사항)

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}