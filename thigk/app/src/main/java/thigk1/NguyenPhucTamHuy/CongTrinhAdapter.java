package thigk1.NguyenPhucTamHuy;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CongTrinhAdapter extends RecyclerView.Adapter<CongTrinhAdapter.CongTrinhViewHolder> {

    Context context;
    ArrayList<CongTrinh> congTrinhList;

    public CongTrinhAdapter(Context context, ArrayList<CongTrinh> congTrinhList) {
        this.context = context;
        this.congTrinhList = congTrinhList;
    }

    @NonNull
    @Override
    public CongTrinhViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_congtrinh, parent, false);
        return new CongTrinhViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CongTrinhViewHolder holder, int position) {
        CongTrinh congTrinh = congTrinhList.get(position);

        holder.tvTen.setText(congTrinh.getTenCongTrinh());
        holder.tvThoiGian.setText(congTrinh.getThoiGian());
        holder.ivHinh.setImageResource(congTrinh.getHinhAnh());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, VldetailActivity.class);
                intent.putExtra("TEN_VAT_LIEU", congTrinh.getTenCongTrinh());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return congTrinhList.size();
    }

    public static class CongTrinhViewHolder extends RecyclerView.ViewHolder {
        ImageView ivHinh;
        TextView tvTen, tvThoiGian;

        public CongTrinhViewHolder(@NonNull View itemView) {
            super(itemView);
            ivHinh = itemView.findViewById(R.id.iv_hinh_congtrinh);
            tvTen = itemView.findViewById(R.id.tv_ten_congtrinh);
            tvThoiGian = itemView.findViewById(R.id.tv_thoi_gian);
        }
    }
}
