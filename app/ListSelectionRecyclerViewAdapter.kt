class ListSelectionRecyclerViewAdapter : RecyclerView.Adapter<ListSelectionViewHolder> {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionVierHolder {
        val binding = ListSElectionViewHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return listSelectionViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.binding.itemNumber.text = (position + 1).toString()
        holder.binding.itemString.text = listTitles[position]
    }

    val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")
}