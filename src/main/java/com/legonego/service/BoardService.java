package com.legonego.service;

import com.legonego.domain.Board;
import com.legonego.domain.Comment;

import java.util.List;

public interface BoardService {

    public List<Board> boardList();   // 게시글 목록 보기
    public Board getBoard(Integer id);  // 게시글 상세보기
    public Integer insertBoard(Board board); // 게시글 작성
    public int updateBoard(Board board);    // 게시글 수정
    public int deleteBoard(Integer id);
    public List<Comment> commentList(Integer par);  // 댓글 리스트 삭제
    public int insertBoardComment(Comment comment); // 댓글 입력
    public Comment getBoardComment(Integer id); // 댓글 상세보기
    public int updateComment(Comment comment); // 댓글 수정
    public int deleteComment(Integer id); // 댓글 삭제
}
