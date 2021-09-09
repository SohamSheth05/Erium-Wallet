package io.horizontalsystems.bankwallet.modules.restorewords

//class RestorePresenterTest {
//
//    private val interactor = Mockito.mock(RestoreWordsModule.Interactor::class.java)
//    private val router = Mockito.mock(RestoreWordsModule.Router::class.java)
//    private val view = Mockito.mock(RestoreWordsModule.View::class.java)
//
//    private lateinit var presenter: RestoreWordsPresenter
//
//    @Before
//    fun setUp() {
//        presenter = RestoreWordsPresenter(12, true, interactor, router)
//        presenter.view = view
//    }
//
//    @Test
//    fun restoreDidClick() {
//        val words = mutableListOf<String>()
//        repeat(12) {
//            val word = "word-$it"
//            words.add(it, word)
//        }
//
//        presenter.onDone(words.joinToString(separator = " " ))
//        verify(interactor).validate(words)
//    }
//
//    @Test
//    fun didFailToValidate() {
//        val exception = Mnemonic.MnemonicException("")
//        val errorId = R.string.Restore_ValidationFailed
//        presenter.didFailToValidate(exception)
//
//        verify(view).showError(errorId)
//    }
//
//    @Test
//    fun didValidate() {
//        presenter.didValidate()
//        verify(router).startSyncModeModule()
//    }
//
//}
