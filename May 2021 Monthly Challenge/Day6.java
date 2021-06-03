class Solution {
    public int maxArea(int h, int w, int[] hor, int[] ver) {
        Arrays.sort(hor);
	Arrays.sort(ver);
	double H=0,V=0;
	for(int i=0;i<ver.length;i++){
		if(i==0){H = Math.max(H,ver[i]);}
		else{H=Math.max(H,ver[i]-ver[i-1]);}
	}
	H=Math.max(H,w-ver[ver.length-1]);

	for(int i=0;i<hor.length;i++){
		if(i==0){V = Math.max(V,hor[i]);}
		else{V=Math.max(V,hor[i]-hor[i-1]);}
	}
	V=Math.max(V,h-hor[hor.length-1]);
	double res = H*V;
	double p = 1000000007;
	return (int)(res%p);
    }
}
