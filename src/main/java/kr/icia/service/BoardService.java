package kr.icia.service;

import java.util.List;

import kr.icia.domain.BoardVO;
import kr.icia.domain.Criteria;

public interface BoardService {

	// public List<BoardVO> getList();
	public List<BoardVO> getList(Criteria cri);

	public int getTotal(Criteria cri);

	public void register(BoardVO board);

	public BoardVO get(Long bno);

	public boolean modify(BoardVO board);

	public boolean remove(Long bno);

}
