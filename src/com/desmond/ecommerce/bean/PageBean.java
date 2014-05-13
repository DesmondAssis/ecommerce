package com.desmond.ecommerce.bean;

import java.util.List;

import com.desmond.ecommerce.interf.model.CommentModel;
import com.desmond.ecommerce.interf.model.GoodsModel;
import com.desmond.ecommerce.interf.model.InfoModel;
import com.desmond.ecommerce.interf.model.OrderModel;

/**
 * 
 * @author Presley
 * @date 8 May 2014 06:33:04
 * @version 1.0
 * #PageBean
 */
public class PageBean {
	private List<InfoModel> infoList;
	private List<GoodsModel> goodsList;
	private List<OrderModel> orderList;
	private List<CommentModel> commentList;
	
	private int totalNum;
	private int pageNum;
	private int totalPage;
	private String printCtr;
	public List<InfoModel> getInfoList() {
		return infoList;
	}
	public void setInfoList(List<InfoModel> infoList) {
		this.infoList = infoList;
	}
	public List<GoodsModel> getGoodsList() {
		return goodsList;
	}
	public void setGoodsList(List<GoodsModel> goodsList) {
		this.goodsList = goodsList;
	}
	public List<OrderModel> getOrderList() {
		return orderList;
	}
	public void setOrderList(List<OrderModel> orderList) {
		this.orderList = orderList;
	}
	public List<CommentModel> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<CommentModel> commentList) {
		this.commentList = commentList;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public String getPrintCtr() {
		return printCtr;
	}
	public void setPrintCtr(String printCtr) {
		this.printCtr = printCtr;
	}

}
