
import java.util.*;

public class twoSum {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner scan=new Scanner(System.in);
		int[] arr= {1,2,3,4,5,6,7};
		ArrayList<Integer> ye=new ArrayList<Integer>();
		List<String> yaw=new ArrayList<String>();
		search(arr,15,-1,ye,yaw);
		System.out.println(yaw);
	}
	static List<String> search(int[] arr, int x,int y,ArrayList<Integer> ye,List<String> yaw) {
		for(int i=y+1;i<arr.length;i++) {
			ye.add(arr[i]);
			if(arr[i]==x) {
				int kl[]=new int[ye.size()];
				for(int l=0;l<ye.size();l++) {
					kl[l]=ye.get(l);
				}
				yaw.add(Arrays.toString(kl));
			}
			if(arr[i]<x) {
				search(arr,x-arr[i],i,ye,yaw);
			}
			if(ye.size()>0)
			ye.remove(ye.size()-1);
		}
		return yaw;
	}
}
