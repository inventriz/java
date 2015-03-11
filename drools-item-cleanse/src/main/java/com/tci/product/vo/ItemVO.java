package com.tci.product.vo;

public class ItemVO {
	
	private String itemId;
	private String itemTitle;
	private String itemDesc;
	private String itemCategory;
	private boolean xCoded;
	
	
	
	
	public boolean isxCoded() {
		return xCoded;
	}

	public void setxCoded(boolean xCoded) {
		this.xCoded = xCoded;
	}

	public ItemVO() {
		super();
	}

	public ItemVO(String itemId, String itemTitle, String itemDesc,
			String itemCategory) {
		super();
		this.itemId = itemId;
		this.itemTitle = itemTitle;
		this.itemDesc = itemDesc;
		this.itemCategory = itemCategory;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemTitle() {
		return itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((itemCategory == null) ? 0 : itemCategory.hashCode());
		result = prime * result
				+ ((itemDesc == null) ? 0 : itemDesc.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result
				+ ((itemTitle == null) ? 0 : itemTitle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemVO other = (ItemVO) obj;
		if (itemCategory == null) {
			if (other.itemCategory != null)
				return false;
		} else if (!itemCategory.equals(other.itemCategory))
			return false;
		if (itemDesc == null) {
			if (other.itemDesc != null)
				return false;
		} else if (!itemDesc.equals(other.itemDesc))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemTitle == null) {
			if (other.itemTitle != null)
				return false;
		} else if (!itemTitle.equals(other.itemTitle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ItemVO [itemId=" + itemId + ", itemTitle=" + itemTitle
				+ ", itemDesc=" + itemDesc + ", itemCategory=" + itemCategory
				+ "]";
	}
	
	

}
