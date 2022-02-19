include(":TypingUsers")
include(":CloneChannels")
include(":CloseDMs")
include(":Gestures")
include(":AudioPlayer")
include(":NormalizeNames")
include(":ClickableMentions")
include(":SlashNick")
include(":NoTimestamps")
include(":BetterTm")
include(":TypingIndicators")
include(":NoPingWidthLimit")
include(":Counters")
include(":HideMessages")
include(":FixBlockedReplies")
include(":NoBuiltInCommands")
include(":OpenProfileInReactions")
include(":NoNitroAvatars")
include(":StreamerMode")
include(":NoUppercase")
include(":FirstMessage")
include(":ConfigurableStickerSizes")
include(":SplitMessages")
include(":OpenDebug")
includeNoCI(":Template")
rootProject.name = "aliucord-plugins"

fun includeNoCI(vararg projectPaths: String?) {
    if (System.getenv("CI") != "true") include(*projectPaths)
}
