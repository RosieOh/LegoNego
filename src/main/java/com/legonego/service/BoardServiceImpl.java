package com.legonego.service;

import com.legonego.domain.Board;
import com.legonego.domain.Comment;
import com.legonego.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;


    @Override
    public List<Board> boardList() {
        return boardMapper.boardList();
    }

    @Override
    public Board getBoard(Integer id) {
        return boardMapper.getBoard(id);
    }

    @Override
    public Integer insertBoard(Board board) {
        return boardMapper.insertBoard(board);
    }

    @Override
    public int updateBoard(Board board) {
        return boardMapper.updateBoard(board);
    }

    @Override
    public int deleteBoard(Integer id) {
        return boardMapper.deleteBoard(id);
    }

    @Override
    public List<Comment> commentList(Integer par) {
        return boardMapper.commentList(par);
    }

    @Override
    public int insertBoardComment(Comment comment) {
        return boardMapper.insertBoardComment(comment);
    }

    @Override
    public Comment getBoardComment(Integer id) {
        return boardMapper.getBoardComment(id);
    }

    @Override
    public int updateComment(Comment comment) {
        return boardMapper.updateComment(comment);
    }

    @Override
    public int deleteComment(Integer id) {
        return boardMapper.deleteComment(id);
    }
}
