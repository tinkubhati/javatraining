package com.prodapt.string.search;

public class StringSearch extends AbstractSearch {
	
	public boolean search(ObjList [] obj_list, ObjList obj)
	{
		for (int i=0;i<obj_list.length;i++)
		{
			if(obj_list[i].str.equals(obj.str))
			{
				return true;
			}
		}
		return false;
	}

}
