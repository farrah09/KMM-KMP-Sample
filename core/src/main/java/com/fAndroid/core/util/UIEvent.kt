package com.fAndroid.core.util

sealed class UiEvent {
    object Success: UiEvent()
    object NavigateUp: UiEvent()
    data class ShowSnackbar(val message: com.fAndroid.core.util.UiText): UiEvent()
}