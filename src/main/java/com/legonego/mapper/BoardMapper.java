package com.legonego.mapper;

import com.legonego.domain.Board;
import com.legonego.domain.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> boardList();   // 게시글 목록 보기
    Board getBoard(Integer id);  // 게시글 상세보기
    Integer insertBoard(Board board); // 게시글 작성
    int updateBoard(Board board);    // 게시글 수정
    int deleteBoard(Integer id);
    List<Comment> commentList(Integer par);  // 댓글 리스트 삭제
    int insertBoardComment(Comment comment); // 댓글 입력
    Comment getBoardComment(Integer id); // 댓글 상세보기
    int updateComment(Comment comment); // 댓글 수정
    int deleteComment(Integer id); // 댓글 삭제
}
