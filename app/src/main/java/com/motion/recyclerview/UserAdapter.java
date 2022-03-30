package com.motion.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public  class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    List<User> names;

    public UserAdapter(List<User> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
     TextView tvName;
     TextView tvAge;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
            tvAge=itemView.findViewById(R.id.tvAge);
        }

        public void bind(User user) {
        tvName.setText(user.getName());
        tvAge.setText(user.getAge());
        }
    }
}
