package com.desmond.ecommerce.bean;

import java.util.List;

import com.desmond.ec.comment.intf.Comment;
import com.desmond.ec.goods.intf.Goods;
import com.desmond.ec.info.intf.Information;
import com.desmond.ec.order.intf.Order;

/**
 * 
 * @author Presley
 * @date 8 May 2014 06:33:04
 * @version 1.0
 * #PageBean
 */
public class PageBean {
	private List<Information> infoList;
	private List<Goods> goodsList;
	private List<Order> orderList;
	private List<Comment> commentList;
	
	private int totalNum;
	private int pageNum;
	private int totalPage;
	private String printCtr;
	/**
	 * Returns the infoList of this PageBean.
	 * @return the infoList
	 */
	public List<Information> getInfoList() {
		return infoList;
	}
	/**
	 * Sets the infoList of this PageBean.
	 * @param infoList the infoList to set
	 */
	public void setInfoList(List<Information> infoList) {
		this.infoList = infoList;
	}
	/**
	 * Returns the goodsList of this PageBean.
	 * @return the goodsList
	 */
	public List<Goods> getGoodsList() {
		return goodsList;
	}
	/**
	 * Sets the goodsList of this PageBean.
	 * @param goodsList the goodsList to set
	 */
	public void setGoodsList(List<Goods> goodsList) {
		this.goodsList = goodsList;
	}
	/**
	 * Returns the orderList of this PageBean.
	 * @return the orderList
	 */
	public List<Order> getOrderList() {
		return orderList;
	}
	/**
	 * Sets the orderList of this PageBean.
	 * @param orderList the orderList to set
	 */
	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	/**
	 * Returns the commentList of this PageBean.
	 * @return the commentList
	 */
	public List<Comment> getCommentList() {
		return commentList;
	}
	/**
	 * Sets the commentList of this PageBean.
	 * @param commentList the commentList to set
	 */
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	/**
	 * Returns the totalNum of this PageBean.
	 * @return the totalNum
	 */
	public int getTotalNum() {
		return totalNum;
	}
	/**
	 * Sets the totalNum of this PageBean.
	 * @param totalNum the totalNum to set
	 */
	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}
	/**
	 * Returns the pageNum of this PageBean.
	 * @return the pageNum
	 */
	public int getPageNum() {
		return pageNum;
	}
	/**
	 * Sets the pageNum of this PageBean.
	 * @param pageNum the pageNum to set
	 */
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	/**
	 * Returns the totalPage of this PageBean.
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}
	/**
	 * Sets the totalPage of this PageBean.
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/**
	 * Returns the printCtr of this PageBean.
	 * @return the printCtr
	 */
	public String getPrintCtr() {
		return printCtr;
	}
	/**
	 * Sets the printCtr of this PageBean.
	 * @param printCtr the printCtr to set
	 */
	public void setPrintCtr(String printCtr) {
		this.printCtr = printCtr;
	}
	
}
