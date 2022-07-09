package util;

import java.util.ArrayList;
import java.util.List;

public class MyPageUtil
{
	private int mybegin;
	private int mypages;
	
	
	
	public int getMybegin() {
		return mybegin;
	}
	public void setMybegin(int mybegin) {
		this.mybegin = mybegin;
	}
	public int getMypages() {
		return mypages;
	}

	public void setMypages(int mypages) {
		this.mypages = mypages;
	}

	public static int getAllpages(int count,int everpage){
		int allpages;
		int k=count%everpage;
		if(k==0) {
			allpages=count/everpage;
		}
		else{
			allpages=count/everpage+1;
		}
		return allpages;
	}
	public static int getUp(int begin) {
		int up;
		int m=begin-1;
		if(m<=0) {
			up=1;
		}else {
			up=m;
		}
		return up;
	}
	public static int getNext(int begin,int allpages) {
		int next=0;
		int p=begin+1;
		if(p>=allpages) {
			next=allpages;
		}else {
			next=p;
		}
		return next;
	}
	public static List<Integer> getSelect(int allpages){
		List<Integer> arr=new ArrayList<Integer>();
		for(int i=1;i<=allpages;i++) {
			arr.add(i);
		}
		return arr;
	}
}
