package tk.onlinesilkstore.recyclergridexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.imageviewholder> {

    private int [] images;

    public RecyclerAdapter(int [] images)
    {
        this.images=images;
    }


    @NonNull
    @Override
    public imageviewholder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout,parent,false);
        imageviewholder imageviewholder=new imageviewholder(view);
        return imageviewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull imageviewholder Holder, int i) {

        int image_id=images[i];
        Holder.album.setImageResource(image_id);
        Holder.albumtitle.setText("image :"+i);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public static class imageviewholder extends RecyclerView.ViewHolder {

        ImageView album;
        TextView albumtitle;

        public imageviewholder(@NonNull View itemView) {

            super(itemView);

            album=itemView.findViewById(R.id.album);
            albumtitle=itemView.findViewById(R.id.album_title);
        }
    }



}
