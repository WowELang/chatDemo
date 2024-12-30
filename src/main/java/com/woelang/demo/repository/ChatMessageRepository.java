package com.woelang.demo.repository;

import com.woelang.demo.model.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {
    List<ChatMessage> findByRoomId(String roomId); // 채팅방 ID로 메시지 조회 (선택 사항)
}