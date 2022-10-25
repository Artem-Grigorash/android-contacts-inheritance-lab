package ru.yandex.practicum.contacts.presentation.base;

public class BaseListDiffCallback<ListDiffInterface<BaseListDiffCallback>> extends DiffUtil.ItemCallback<> {

    @Override
    public boolean areItemsTheSame( next) {
        return theSameAs(next);
    }

    @Override
    public boolean areContentsTheSame(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return newItem;
    }
}