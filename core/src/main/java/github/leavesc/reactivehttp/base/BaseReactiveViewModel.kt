package github.leavesc.reactivehttp.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import github.leavesc.reactivehttp.viewmodel.*
import kotlinx.coroutines.CoroutineScope

/**
 * 作者：leavesC
 * 时间：2020/7/24 0:43
 * 描述：
 * GitHub：https://github.com/leavesC
 */
open class BaseReactiveViewModel : ViewModel(), IViewModelActionEvent {

    override val lifecycleSupportedScope: CoroutineScope
        get() = viewModelScope

    override val showLoadingLD = MutableLiveData<ShowLoadingEvent>()

    override val dismissLoadingLD = MutableLiveData<DismissLoadingEvent>()

    override val showToastEventLD = MutableLiveData<ShowToastEvent>()

    override val finishViewEventLD = MutableLiveData<FinishViewEvent>()

}