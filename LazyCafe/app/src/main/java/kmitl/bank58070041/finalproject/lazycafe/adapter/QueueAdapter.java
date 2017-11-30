package kmitl.bank58070041.finalproject.lazycafe.adapter;


import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import kmitl.bank58070041.finalproject.lazycafe.R;
import kmitl.bank58070041.finalproject.lazycafe.model.Bill;

public class QueueAdapter extends RecyclerView.Adapter<QueueAdapter.Holder>  {
    private Activity context;
    private ArrayList<Bill> bills;
    private  FragmentActivity fragmentActivity;

    public QueueAdapter(Activity context, FragmentActivity fragmentActivity) {
        this.context = context;
        this.fragmentActivity = fragmentActivity;
    }



    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, null);
        return new Holder(view);
    }



    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Bill bill = bills.get(position);

        holder.billName.setText(bill.getCoffee());
        holder.totalPrice.setText("Total : "+bill.getPrice());
        holder.userName.setText(bill.getUsername());
        holder.time.setText("Pick Coffee "+bill.getTime());
        Glide.with(context).load(bill.getPicture()).into(holder.picture);
    }

    @Override
    public int getItemCount() {

        return bills.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        ImageView picture;
        TextView billName, totalPrice, time, userName;

        public Holder(View itemView){
            super(itemView);

            picture = itemView.findViewById(R.id.picture);
            billName = itemView.findViewById(R.id.billName);
            totalPrice = itemView.findViewById(R.id.totalPrice);
            time = itemView.findViewById(R.id.timeText);
            userName = itemView.findViewById(R.id.userName);

        }
    }
    public void setBills(ArrayList<Bill> bills){
        this.bills = bills;
    }
}
