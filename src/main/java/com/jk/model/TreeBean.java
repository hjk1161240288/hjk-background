package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class TreeBean implements Serializable{

    private Integer id;
	
	private String text;
	
	private String href;
	
	private Integer pid;
	
	private List<TreeBean> nodes;
	
	private Boolean selectable;

	public Integer getId() {
		return id;
	}

	public String getText() {
		return text;
	}

	public String getHref() {
		return href;
	}

	public Integer getPid() {
		return pid;
	}

	public List<TreeBean> getNodes() {
		return nodes;
	}

	public Boolean getSelectable() {
		return selectable;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public void setNodes(List<TreeBean> nodes) {
		this.nodes = nodes;
	}

	public void setSelectable(Boolean selectable) {
		this.selectable = selectable;
	}

	@Override
	public String toString() {
		return "TreeBean [id=" + id + ", text=" + text + ", href=" + href + ", pid=" + pid + ", nodes=" + nodes
				+ ", selectable=" + selectable + "]";
	}
	
	
}
