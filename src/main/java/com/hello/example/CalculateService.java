package com.hello.example;

import org.springframework.stereotype.Component;

@Component
public class CalculateService {
    private DataService dataService;
    public CalculateService(DataService dataService){
        super();
        this.dataService=dataService;
    }
    public int findMax(){
        int[] ar=dataService.retrieveData();
        sort(ar,0,ar.length-1);
        return ar[ar.length-1];
    }
    private void sort(int[] ar,int l,int h) {
        if(l==h)return;
        int mid=(l+h)/2;
        sort(ar,l,mid);
        sort(ar,mid+1,h);
        merge(ar,l,mid,h);
    }
    private void merge(int[] ar, int l, int mid, int h) {
        int[] tmp=new int[h-l+1];
        int idx=0;
        int pntr1=l, pntr2=mid+1;
        while(pntr1<=mid && pntr2<=h){
            if(ar[pntr1]<ar[pntr2]){
                tmp[idx]=ar[pntr1];
                idx++;
                pntr1++;
            }else{
                tmp[idx]=ar[pntr2];
                idx++;
                pntr2++;
            }
        }
        while(pntr1<=mid){
            tmp[idx]=ar[pntr1];
            idx++;
            pntr1++;
        }
        while(pntr2<=h){
            tmp[idx]=ar[pntr2];
            idx++;
            pntr2++;
        }
        for(int i=l;i<=h;i++){
            ar[i]=tmp[i-l];
        }
    }
}
