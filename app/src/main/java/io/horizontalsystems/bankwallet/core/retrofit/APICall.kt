package io.horizontalsystems.bankwallet.core.retrofit

import io.horizontalsystems.bankwallet.entities.request.RegisterRequest
import io.horizontalsystems.bankwallet.entities.response.RegisterResponse
import io.horizontalsystems.bankwallet.entities.response.ResponseData
import io.horizontalsystems.bankwallet.entities.response.UserData
import io.reactivex.Observable
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface APICall {

    @POST(API.REGISTER)
    fun register(
        @Body param: RegisterRequest,
    ): Observable<Response<RegisterResponse>>

    @POST(API.LOGIN)
    fun login(@Body param: HashMap<String, String>): Observable<Response<ResponseData<UserData>>>
    /*  @GET(API.CHALLENGE_DETAIL_MOBILE)
      fun getChallengeDetailById(
          @Query("id") id: Int,
          @Query("active_challenge_id") activeChallengeId: Int,
      ): Observable<Response<ChallengeDetailResponse>>

      @GET(API.SEE_ALL_CHALLENGES)
      fun getAllChallengesList(
          @Query("page") page: Int,
          @Query("page_size") page_size: Int,
      ): Observable<Response<SeeAllChallengeResponse>>

      @GET(API.SEE_ALL_CHALLENGES)
      fun getAllChallengesList(
          @Query("id") id: Int,
          @Query("page") page: Int,
          @Query("page_size") page_size: Int,
      ): Observable<Response<SeeAllChallengeResponse>>

      @GET(API.SEE_ALL_CHALLENGES)
      fun getAllChallengesList(
          @Query("page") page: Int,
          @Query("page_size") page_size: Int,
          @Query("latitude") latitude: String,
          @Query("longitude") longitude: String,
      ): Observable<Response<SeeAllChallengeResponse>>

      @POST(API.ADD_COMMENT)
      fun addComments(
          @Body param: AddCommentRequest,
      ): Observable<Response<AddCommentResponse>>

      @POST(API.ADD_SUB_COMMENT)
      fun addSubComment(
          @Body param: AddCommentRequest,
      ): Observable<Response<AddCommentResponse>>

      @GET(API.COMMENT_LIST)
      fun commentList(
          @Query("id") challengeId: String,
      ): Observable<Response<CommentListResponse>>

      @GET(API.SUB_COMMENTS_LIST)
      fun subCommentsList(
          @Query("challenge_comment_id") challengeCommentId: String,
      ): Observable<Response<SubCommentListResponse>>

      @POST(API.CREATE_CHALLENGE)
      fun createChallenge(
          @Body param: CreateChallengeRequest,
      ): Observable<Response<CreateChallengeResponse>>

      @POST(API.USER_ACCEPT_CHALLENGE)
      fun userAcceptChallenge(
          @Body param: AcceptChallengeRequest,
      ): Observable<Response<AcceptChallengeResponse>>

      @GET(API.MY_ACTIVE_CHALLENGES)
      fun myActiveChallenges(): Observable<Response<MyAcceptedChallengeResponse>>

      @GET(API.LEAVE_CHALLENGE)
      fun leaveChallenge(
          @Query("id") challengeId: String,
      ): Observable<Response<BaseResponse<Any>>>

      @DELETE(API.DELETE_CHALLENGE)
      fun deleteChallenge(
          @Query("challenge_id") challengeId: String,
      ): Observable<Response<BaseResponse<Any>>>

      @GET(API.SHOP_PRODUCT_PURCHASE_HISTORY)
      fun shopProductPurchaseHistory(
          @Query("page") page: Int,
          @Query("page_size") page_size: Int,
      ): Observable<Response<ShoppingTransactionHistoryResponse>>*/

}