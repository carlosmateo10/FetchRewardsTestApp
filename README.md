# FetchRewardsTestApp
This app retrieves a JSON file from a given url, using a secret-key, also given. For this purpose Volley is used.
The data is stored as List<Item>, where Item is a model class that represents each Item of the list.
Then, the list with all the items is sorted, first by ListID, and then by Name.
Lastly, the data is displayed using a RecyclerView.
