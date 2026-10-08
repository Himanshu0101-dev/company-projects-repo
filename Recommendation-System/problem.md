Problem Statement:  
Build a product recommendation engine using collaborative filtering for an online marketplace.

Solution Outline:

Construct user-item interaction matrix.

Apply matrix factorization (SVD).

Generate top-N recommendations per user.

Testcase:

Input:

Code
User A → [Shoes, Watch]
User B → [Shoes, Bag]
User C → [Watch]
Output:

Code
Recommendations for User C → [Shoes, Bag]
