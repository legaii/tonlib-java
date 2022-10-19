package drinkless.org.ton;

public class TonApi {
    public abstract static class Object {
        public native String toString();

        public abstract int getConstructor();
    }

    public abstract static class Function extends Object {
        public native String toString();
    }

    public static class AccountAddress extends Object {
        public String accountAddress;

        public AccountAddress() {
        }

        public AccountAddress(String accountAddress) {
            this.accountAddress = accountAddress;
        }

        public static final int CONSTRUCTOR = 755613099;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AccountList extends Object {
        public FullAccountState[] accounts;

        public AccountList() {
        }

        public AccountList(FullAccountState[] accounts) {
            this.accounts = accounts;
        }

        public static final int CONSTRUCTOR = 2017374805;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AccountRevisionList extends Object {
        public FullAccountState[] revisions;

        public AccountRevisionList() {
        }

        public AccountRevisionList(FullAccountState[] revisions) {
            this.revisions = revisions;
        }

        public static final int CONSTRUCTOR = 527197386;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class AccountState extends Object {
    }

    public static class RawAccountState extends AccountState {
        public byte[] code;
        public byte[] data;
        public byte[] frozenHash;

        public RawAccountState() {
        }

        public RawAccountState(byte[] code, byte[] data, byte[] frozenHash) {
            this.code = code;
            this.data = data;
            this.frozenHash = frozenHash;
        }

        public static final int CONSTRUCTOR = -531917254;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WalletV3AccountState extends AccountState {
        public long walletId;
        public int seqno;

        public WalletV3AccountState() {
        }

        public WalletV3AccountState(long walletId, int seqno) {
            this.walletId = walletId;
            this.seqno = seqno;
        }

        public static final int CONSTRUCTOR = -1619351478;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WalletHighloadV1AccountState extends AccountState {
        public long walletId;
        public int seqno;

        public WalletHighloadV1AccountState() {
        }

        public WalletHighloadV1AccountState(long walletId, int seqno) {
            this.walletId = walletId;
            this.seqno = seqno;
        }

        public static final int CONSTRUCTOR = 1616372956;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WalletHighloadV2AccountState extends AccountState {
        public long walletId;

        public WalletHighloadV2AccountState() {
        }

        public WalletHighloadV2AccountState(long walletId) {
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = -1803723441;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsAccountState extends AccountState {
        public long walletId;

        public DnsAccountState() {
        }

        public DnsAccountState(long walletId) {
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = 1727715434;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RwalletAccountState extends AccountState {
        public long walletId;
        public int seqno;
        public long unlockedBalance;
        public RwalletConfig config;

        public RwalletAccountState() {
        }

        public RwalletAccountState(long walletId, int seqno, long unlockedBalance, RwalletConfig config) {
            this.walletId = walletId;
            this.seqno = seqno;
            this.unlockedBalance = unlockedBalance;
            this.config = config;
        }

        public static final int CONSTRUCTOR = -739540008;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanAccountState extends AccountState {
        public PchanConfig config;
        public PchanState state;
        public String description;

        public PchanAccountState() {
        }

        public PchanAccountState(PchanConfig config, PchanState state, String description) {
            this.config = config;
            this.state = state;
            this.description = description;
        }

        public static final int CONSTRUCTOR = 1612869496;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UninitedAccountState extends AccountState {
        public byte[] frozenHash;

        public UninitedAccountState() {
        }

        public UninitedAccountState(byte[] frozenHash) {
            this.frozenHash = frozenHash;
        }

        public static final int CONSTRUCTOR = 1522374408;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class Action extends Object {
    }

    public static class ActionNoop extends Action {

        public ActionNoop() {
        }

        public static final int CONSTRUCTOR = 1135848603;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ActionMsg extends Action {
        public MsgMessage[] messages;
        public boolean allowSendToUninited;

        public ActionMsg() {
        }

        public ActionMsg(MsgMessage[] messages, boolean allowSendToUninited) {
            this.messages = messages;
            this.allowSendToUninited = allowSendToUninited;
        }

        public static final int CONSTRUCTOR = 246839120;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ActionDns extends Action {
        public DnsAction[] actions;

        public ActionDns() {
        }

        public ActionDns(DnsAction[] actions) {
            this.actions = actions;
        }

        public static final int CONSTRUCTOR = 1193750561;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ActionPchan extends Action {
        public PchanAction action;

        public ActionPchan() {
        }

        public ActionPchan(PchanAction action) {
            this.action = action;
        }

        public static final int CONSTRUCTOR = -1490172447;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ActionRwallet extends Action {
        public RwalletActionInit action;

        public ActionRwallet() {
        }

        public ActionRwallet(RwalletActionInit action) {
            this.action = action;
        }

        public static final int CONSTRUCTOR = -117295163;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AdnlAddress extends Object {
        public String adnlAddress;

        public AdnlAddress() {
        }

        public AdnlAddress(String adnlAddress) {
            this.adnlAddress = adnlAddress;
        }

        public static final int CONSTRUCTOR = 70358284;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Bip39Hints extends Object {
        public String[] words;

        public Bip39Hints() {
        }

        public Bip39Hints(String[] words) {
            this.words = words;
        }

        public static final int CONSTRUCTOR = 1012243456;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Config extends Object {
        public String config;
        public String blockchainName;
        public boolean useCallbacksForNetwork;
        public boolean ignoreCache;

        public Config() {
        }

        public Config(String config, String blockchainName, boolean useCallbacksForNetwork, boolean ignoreCache) {
            this.config = config;
            this.blockchainName = blockchainName;
            this.useCallbacksForNetwork = useCallbacksForNetwork;
            this.ignoreCache = ignoreCache;
        }

        public static final int CONSTRUCTOR = -1538391496;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ConfigInfo extends Object {
        public TvmCell config;

        public ConfigInfo() {
        }

        public ConfigInfo(TvmCell config) {
            this.config = config;
        }

        public static final int CONSTRUCTOR = 687887871;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Data extends Object {
        public byte[] bytes;

        public Data() {
        }

        public Data(byte[] bytes) {
            this.bytes = bytes;
        }

        public static final int CONSTRUCTOR = -414733967;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Error extends Object {
        public int code;
        public String message;

        public Error() {
        }

        public Error(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public static final int CONSTRUCTOR = -1679978726;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportedEncryptedKey extends Object {
        public byte[] data;

        public ExportedEncryptedKey() {
        }

        public ExportedEncryptedKey(byte[] data) {
            this.data = data;
        }

        public static final int CONSTRUCTOR = 2024406612;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportedKey extends Object {
        public String[] wordList;

        public ExportedKey() {
        }

        public ExportedKey(String[] wordList) {
            this.wordList = wordList;
        }

        public static final int CONSTRUCTOR = -1449248297;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportedPemKey extends Object {
        public String pem;

        public ExportedPemKey() {
        }

        public ExportedPemKey(String pem) {
            this.pem = pem;
        }

        public static final int CONSTRUCTOR = 1425473725;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportedUnencryptedKey extends Object {
        public byte[] data;

        public ExportedUnencryptedKey() {
        }

        public ExportedUnencryptedKey(byte[] data) {
            this.data = data;
        }

        public static final int CONSTRUCTOR = 730045160;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Fees extends Object {
        public long inFwdFee;
        public long storageFee;
        public long gasFee;
        public long fwdFee;

        public Fees() {
        }

        public Fees(long inFwdFee, long storageFee, long gasFee, long fwdFee) {
            this.inFwdFee = inFwdFee;
            this.storageFee = storageFee;
            this.gasFee = gasFee;
            this.fwdFee = fwdFee;
        }

        public static final int CONSTRUCTOR = 1676273340;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class FullAccountState extends Object {
        public AccountAddress address;
        public long balance;
        public InternalTransactionId lastTransactionId;
        public TonBlockIdExt blockId;
        public long syncUtime;
        public AccountState accountState;
        public int revision;

        public FullAccountState() {
        }

        public FullAccountState(AccountAddress address, long balance, InternalTransactionId lastTransactionId, TonBlockIdExt blockId, long syncUtime, AccountState accountState, int revision) {
            this.address = address;
            this.balance = balance;
            this.lastTransactionId = lastTransactionId;
            this.blockId = blockId;
            this.syncUtime = syncUtime;
            this.accountState = accountState;
            this.revision = revision;
        }

        public static final int CONSTRUCTOR = 1456618057;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InitialAccountState extends Object {
    }

    public static class RawInitialAccountState extends InitialAccountState {
        public byte[] code;
        public byte[] data;

        public RawInitialAccountState() {
        }

        public RawInitialAccountState(byte[] code, byte[] data) {
            this.code = code;
            this.data = data;
        }

        public static final int CONSTRUCTOR = -337945529;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WalletV3InitialAccountState extends InitialAccountState {
        public String publicKey;
        public long walletId;

        public WalletV3InitialAccountState() {
        }

        public WalletV3InitialAccountState(String publicKey, long walletId) {
            this.publicKey = publicKey;
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = -118074048;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WalletHighloadV1InitialAccountState extends InitialAccountState {
        public String publicKey;
        public long walletId;

        public WalletHighloadV1InitialAccountState() {
        }

        public WalletHighloadV1InitialAccountState(String publicKey, long walletId) {
            this.publicKey = publicKey;
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = -327901626;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WalletHighloadV2InitialAccountState extends InitialAccountState {
        public String publicKey;
        public long walletId;

        public WalletHighloadV2InitialAccountState() {
        }

        public WalletHighloadV2InitialAccountState(String publicKey, long walletId) {
            this.publicKey = publicKey;
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = 1966373161;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RwalletInitialAccountState extends InitialAccountState {
        public String initPublicKey;
        public String publicKey;
        public long walletId;

        public RwalletInitialAccountState() {
        }

        public RwalletInitialAccountState(String initPublicKey, String publicKey, long walletId) {
            this.initPublicKey = initPublicKey;
            this.publicKey = publicKey;
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = 1169755156;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsInitialAccountState extends InitialAccountState {
        public String publicKey;
        public long walletId;

        public DnsInitialAccountState() {
        }

        public DnsInitialAccountState(String publicKey, long walletId) {
            this.publicKey = publicKey;
            this.walletId = walletId;
        }

        public static final int CONSTRUCTOR = 1842062527;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanInitialAccountState extends InitialAccountState {
        public PchanConfig config;

        public PchanInitialAccountState() {
        }

        public PchanInitialAccountState(PchanConfig config) {
            this.config = config;
        }

        public static final int CONSTRUCTOR = -1304552124;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class InputKey extends Object {
    }

    public static class InputKeyRegular extends InputKey {
        public Key key;
        public byte[] localPassword;

        public InputKeyRegular() {
        }

        public InputKeyRegular(Key key, byte[] localPassword) {
            this.key = key;
            this.localPassword = localPassword;
        }

        public static final int CONSTRUCTOR = -555399522;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InputKeyFake extends InputKey {

        public InputKeyFake() {
        }

        public static final int CONSTRUCTOR = -1074054722;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Key extends Object {
        public String publicKey;
        public byte[] secret;

        public Key() {
        }

        public Key(String publicKey, byte[] secret) {
            this.publicKey = publicKey;
            this.secret = secret;
        }

        public static final int CONSTRUCTOR = -1978362923;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class KeyStoreType extends Object {
    }

    public static class KeyStoreTypeDirectory extends KeyStoreType {
        public String directory;

        public KeyStoreTypeDirectory() {
        }

        public KeyStoreTypeDirectory(String directory) {
            this.directory = directory;
        }

        public static final int CONSTRUCTOR = -378990038;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class KeyStoreTypeInMemory extends KeyStoreType {

        public KeyStoreTypeInMemory() {
        }

        public static final int CONSTRUCTOR = -2106848825;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class LogStream extends Object {
    }

    public static class LogStreamDefault extends LogStream {

        public LogStreamDefault() {
        }

        public static final int CONSTRUCTOR = 1390581436;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogStreamFile extends LogStream {
        public String path;
        public long maxFileSize;

        public LogStreamFile() {
        }

        public LogStreamFile(String path, long maxFileSize) {
            this.path = path;
            this.maxFileSize = maxFileSize;
        }

        public static final int CONSTRUCTOR = -1880085930;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogStreamEmpty extends LogStream {

        public LogStreamEmpty() {
        }

        public static final int CONSTRUCTOR = -499912244;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogTags extends Object {
        public String[] tags;

        public LogTags() {
        }

        public LogTags(String[] tags) {
            this.tags = tags;
        }

        public static final int CONSTRUCTOR = -1604930601;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LogVerbosityLevel extends Object {
        public int verbosityLevel;

        public LogVerbosityLevel() {
        }

        public LogVerbosityLevel(int verbosityLevel) {
            this.verbosityLevel = verbosityLevel;
        }

        public static final int CONSTRUCTOR = 1734624234;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Ok extends Object {

        public Ok() {
        }

        public static final int CONSTRUCTOR = -722616727;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Options extends Object {
        public Config config;
        public KeyStoreType keystoreType;

        public Options() {
        }

        public Options(Config config, KeyStoreType keystoreType) {
            this.config = config;
            this.keystoreType = keystoreType;
        }

        public static final int CONSTRUCTOR = -1924388359;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SyncState extends Object {
    }

    public static class SyncStateDone extends SyncState {

        public SyncStateDone() {
        }

        public static final int CONSTRUCTOR = 1408448777;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SyncStateInProgress extends SyncState {
        public int fromSeqno;
        public int toSeqno;
        public int currentSeqno;

        public SyncStateInProgress() {
        }

        public SyncStateInProgress(int fromSeqno, int toSeqno, int currentSeqno) {
            this.fromSeqno = fromSeqno;
            this.toSeqno = toSeqno;
            this.currentSeqno = currentSeqno;
        }

        public static final int CONSTRUCTOR = 107726023;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnpackedAccountAddress extends Object {
        public int workchainId;
        public boolean bounceable;
        public boolean testnet;
        public byte[] addr;

        public UnpackedAccountAddress() {
        }

        public UnpackedAccountAddress(int workchainId, boolean bounceable, boolean testnet, byte[] addr) {
            this.workchainId = workchainId;
            this.bounceable = bounceable;
            this.testnet = testnet;
            this.addr = addr;
        }

        public static final int CONSTRUCTOR = 1892946998;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class Update extends Object {
    }

    public static class UpdateSendLiteServerQuery extends Update {
        public long id;
        public byte[] data;

        public UpdateSendLiteServerQuery() {
        }

        public UpdateSendLiteServerQuery(long id, byte[] data) {
            this.id = id;
            this.data = data;
        }

        public static final int CONSTRUCTOR = -1555130916;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UpdateSyncState extends Update {
        public SyncState syncState;

        public UpdateSyncState() {
        }

        public UpdateSyncState(SyncState syncState) {
            this.syncState = syncState;
        }

        public static final int CONSTRUCTOR = 1204298718;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksAccountTransactionId extends Object {
        public byte[] account;
        public long lt;

        public BlocksAccountTransactionId() {
        }

        public BlocksAccountTransactionId(byte[] account, long lt) {
            this.account = account;
            this.lt = lt;
        }

        public static final int CONSTRUCTOR = -872996220;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksBlockLinkBack extends Object {
        public boolean toKeyBlock;
        public TonBlockIdExt from;
        public TonBlockIdExt to;
        public byte[] destProof;
        public byte[] proof;
        public byte[] stateProof;

        public BlocksBlockLinkBack() {
        }

        public BlocksBlockLinkBack(boolean toKeyBlock, TonBlockIdExt from, TonBlockIdExt to, byte[] destProof, byte[] proof, byte[] stateProof) {
            this.toKeyBlock = toKeyBlock;
            this.from = from;
            this.to = to;
            this.destProof = destProof;
            this.proof = proof;
            this.stateProof = stateProof;
        }

        public static final int CONSTRUCTOR = 1099726901;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksBlockSignatures extends Object {
        public TonBlockIdExt id;
        public BlocksSignature[] signatures;

        public BlocksBlockSignatures() {
        }

        public BlocksBlockSignatures(TonBlockIdExt id, BlocksSignature[] signatures) {
            this.id = id;
            this.signatures = signatures;
        }

        public static final int CONSTRUCTOR = -402531429;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksHeader extends Object {
        public TonBlockIdExt id;
        public int globalId;
        public int version;
        public int flags;
        public boolean afterMerge;
        public boolean afterSplit;
        public boolean beforeSplit;
        public boolean wantMerge;
        public boolean wantSplit;
        public int validatorListHashShort;
        public int catchainSeqno;
        public int minRefMcSeqno;
        public boolean isKeyBlock;
        public int prevKeyBlockSeqno;
        public long startLt;
        public long endLt;
        public long genUtime;
        public int vertSeqno;
        public TonBlockIdExt[] prevBlocks;

        public BlocksHeader() {
        }

        public BlocksHeader(TonBlockIdExt id, int globalId, int version, int flags, boolean afterMerge, boolean afterSplit, boolean beforeSplit, boolean wantMerge, boolean wantSplit, int validatorListHashShort, int catchainSeqno, int minRefMcSeqno, boolean isKeyBlock, int prevKeyBlockSeqno, long startLt, long endLt, long genUtime, int vertSeqno, TonBlockIdExt[] prevBlocks) {
            this.id = id;
            this.globalId = globalId;
            this.version = version;
            this.flags = flags;
            this.afterMerge = afterMerge;
            this.afterSplit = afterSplit;
            this.beforeSplit = beforeSplit;
            this.wantMerge = wantMerge;
            this.wantSplit = wantSplit;
            this.validatorListHashShort = validatorListHashShort;
            this.catchainSeqno = catchainSeqno;
            this.minRefMcSeqno = minRefMcSeqno;
            this.isKeyBlock = isKeyBlock;
            this.prevKeyBlockSeqno = prevKeyBlockSeqno;
            this.startLt = startLt;
            this.endLt = endLt;
            this.genUtime = genUtime;
            this.vertSeqno = vertSeqno;
            this.prevBlocks = prevBlocks;
        }

        public static final int CONSTRUCTOR = 1479116386;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksMasterchainInfo extends Object {
        public TonBlockIdExt last;
        public byte[] stateRootHash;
        public TonBlockIdExt init;

        public BlocksMasterchainInfo() {
        }

        public BlocksMasterchainInfo(TonBlockIdExt last, byte[] stateRootHash, TonBlockIdExt init) {
            this.last = last;
            this.stateRootHash = stateRootHash;
            this.init = init;
        }

        public static final int CONSTRUCTOR = 835339083;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksShardBlockLink extends Object {
        public TonBlockIdExt id;
        public byte[] proof;

        public BlocksShardBlockLink() {
        }

        public BlocksShardBlockLink(TonBlockIdExt id, byte[] proof) {
            this.id = id;
            this.proof = proof;
        }

        public static final int CONSTRUCTOR = -1495263895;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksShardBlockProof extends Object {
        public TonBlockIdExt from;
        public TonBlockIdExt mcId;
        public BlocksShardBlockLink[] links;
        public BlocksBlockLinkBack[] mcProof;

        public BlocksShardBlockProof() {
        }

        public BlocksShardBlockProof(TonBlockIdExt from, TonBlockIdExt mcId, BlocksShardBlockLink[] links, BlocksBlockLinkBack[] mcProof) {
            this.from = from;
            this.mcId = mcId;
            this.links = links;
            this.mcProof = mcProof;
        }

        public static final int CONSTRUCTOR = -69836973;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksShards extends Object {
        public TonBlockIdExt[] shards;

        public BlocksShards() {
        }

        public BlocksShards(TonBlockIdExt[] shards) {
            this.shards = shards;
        }

        public static final int CONSTRUCTOR = 2069473610;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksSignature extends Object {
        public byte[] nodeIdShort;
        public byte[] signature;

        public BlocksSignature() {
        }

        public BlocksSignature(byte[] nodeIdShort, byte[] signature) {
            this.nodeIdShort = nodeIdShort;
            this.signature = signature;
        }

        public static final int CONSTRUCTOR = -1223522111;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksTransactions extends Object {
        public TonBlockIdExt id;
        public int reqCount;
        public boolean incomplete;
        public BlocksShortTxId[] transactions;

        public BlocksTransactions() {
        }

        public BlocksTransactions(TonBlockIdExt id, int reqCount, boolean incomplete, BlocksShortTxId[] transactions) {
            this.id = id;
            this.reqCount = reqCount;
            this.incomplete = incomplete;
            this.transactions = transactions;
        }

        public static final int CONSTRUCTOR = -1922305900;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class DnsAction extends Object {
    }

    public static class DnsActionDeleteAll extends DnsAction {

        public DnsActionDeleteAll() {
        }

        public static final int CONSTRUCTOR = 1067356318;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsActionDelete extends DnsAction {
        public String name;
        public byte[] category;

        public DnsActionDelete() {
        }

        public DnsActionDelete(String name, byte[] category) {
            this.name = name;
            this.category = category;
        }

        public static final int CONSTRUCTOR = 1141342033;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsActionSet extends DnsAction {
        public DnsEntry entry;

        public DnsActionSet() {
        }

        public DnsActionSet(DnsEntry entry) {
            this.entry = entry;
        }

        public static final int CONSTRUCTOR = -1374965309;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsEntry extends Object {
        public String name;
        public byte[] category;
        public DnsEntryData entry;

        public DnsEntry() {
        }

        public DnsEntry(String name, byte[] category, DnsEntryData entry) {
            this.name = name;
            this.category = category;
            this.entry = entry;
        }

        public static final int CONSTRUCTOR = 505104294;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class DnsEntryData extends Object {
    }

    public static class DnsEntryDataUnknown extends DnsEntryData {
        public byte[] bytes;

        public DnsEntryDataUnknown() {
        }

        public DnsEntryDataUnknown(byte[] bytes) {
            this.bytes = bytes;
        }

        public static final int CONSTRUCTOR = -1285893248;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsEntryDataText extends DnsEntryData {
        public String text;

        public DnsEntryDataText() {
        }

        public DnsEntryDataText(String text) {
            this.text = text;
        }

        public static final int CONSTRUCTOR = -792485614;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsEntryDataNextResolver extends DnsEntryData {
        public AccountAddress resolver;

        public DnsEntryDataNextResolver() {
        }

        public DnsEntryDataNextResolver(AccountAddress resolver) {
            this.resolver = resolver;
        }

        public static final int CONSTRUCTOR = 330382792;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsEntryDataSmcAddress extends DnsEntryData {
        public AccountAddress smcAddress;

        public DnsEntryDataSmcAddress() {
        }

        public DnsEntryDataSmcAddress(AccountAddress smcAddress) {
            this.smcAddress = smcAddress;
        }

        public static final int CONSTRUCTOR = -1759937982;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsEntryDataAdnlAddress extends DnsEntryData {
        public AdnlAddress adnlAddress;

        public DnsEntryDataAdnlAddress() {
        }

        public DnsEntryDataAdnlAddress(AdnlAddress adnlAddress) {
            this.adnlAddress = adnlAddress;
        }

        public static final int CONSTRUCTOR = -1114064368;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsResolved extends Object {
        public DnsEntry[] entries;

        public DnsResolved() {
        }

        public DnsResolved(DnsEntry[] entries) {
            this.entries = entries;
        }

        public static final int CONSTRUCTOR = 2090272150;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TonBlockId extends Object {
        public int workchain;
        public long shard;
        public int seqno;

        public TonBlockId() {
        }

        public TonBlockId(int workchain, long shard, int seqno) {
            this.workchain = workchain;
            this.shard = shard;
            this.seqno = seqno;
        }

        public static final int CONSTRUCTOR = -1185382494;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class InternalTransactionId extends Object {
        public long lt;
        public byte[] hash;

        public InternalTransactionId() {
        }

        public InternalTransactionId(long lt, byte[] hash) {
            this.lt = lt;
            this.hash = hash;
        }

        public static final int CONSTRUCTOR = -989527262;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LiteServerInfo extends Object {
        public long now;
        public int version;
        public long capabilities;

        public LiteServerInfo() {
        }

        public LiteServerInfo(long now, int version, long capabilities) {
            this.now = now;
            this.version = version;
            this.capabilities = capabilities;
        }

        public static final int CONSTRUCTOR = -1250165133;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksShortTxId extends Object {
        public int mode;
        public byte[] account;
        public long lt;
        public byte[] hash;

        public BlocksShortTxId() {
        }

        public BlocksShortTxId(int mode, byte[] account, long lt, byte[] hash) {
            this.mode = mode;
            this.account = account;
            this.lt = lt;
            this.hash = hash;
        }

        public static final int CONSTRUCTOR = 487976773;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class MsgData extends Object {
    }

    public static class MsgDataRaw extends MsgData {
        public byte[] body;
        public byte[] initState;

        public MsgDataRaw() {
        }

        public MsgDataRaw(byte[] body, byte[] initState) {
            this.body = body;
            this.initState = initState;
        }

        public static final int CONSTRUCTOR = -1928962698;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataText extends MsgData {
        public byte[] text;

        public MsgDataText() {
        }

        public MsgDataText(byte[] text) {
            this.text = text;
        }

        public static final int CONSTRUCTOR = -341560688;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataDecryptedText extends MsgData {
        public byte[] text;

        public MsgDataDecryptedText() {
        }

        public MsgDataDecryptedText(byte[] text) {
            this.text = text;
        }

        public static final int CONSTRUCTOR = -1289133895;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataEncryptedText extends MsgData {
        public byte[] text;

        public MsgDataEncryptedText() {
        }

        public MsgDataEncryptedText(byte[] text) {
            this.text = text;
        }

        public static final int CONSTRUCTOR = -296612902;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataDecrypted extends Object {
        public byte[] proof;
        public MsgData data;

        public MsgDataDecrypted() {
        }

        public MsgDataDecrypted(byte[] proof, MsgData data) {
            this.proof = proof;
            this.data = data;
        }

        public static final int CONSTRUCTOR = 195649769;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataDecryptedArray extends Object {
        public MsgDataDecrypted[] elements;

        public MsgDataDecryptedArray() {
        }

        public MsgDataDecryptedArray(MsgDataDecrypted[] elements) {
            this.elements = elements;
        }

        public static final int CONSTRUCTOR = -480491767;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataEncrypted extends Object {
        public AccountAddress source;
        public MsgData data;

        public MsgDataEncrypted() {
        }

        public MsgDataEncrypted(AccountAddress source, MsgData data) {
            this.source = source;
            this.data = data;
        }

        public static final int CONSTRUCTOR = 564215121;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDataEncryptedArray extends Object {
        public MsgDataEncrypted[] elements;

        public MsgDataEncryptedArray() {
        }

        public MsgDataEncryptedArray(MsgDataEncrypted[] elements) {
            this.elements = elements;
        }

        public static final int CONSTRUCTOR = 608655794;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgMessage extends Object {
        public AccountAddress destination;
        public String publicKey;
        public long amount;
        public MsgData data;
        public int sendMode;

        public MsgMessage() {
        }

        public MsgMessage(AccountAddress destination, String publicKey, long amount, MsgData data, int sendMode) {
            this.destination = destination;
            this.publicKey = publicKey;
            this.amount = amount;
            this.data = data;
            this.sendMode = sendMode;
        }

        public static final int CONSTRUCTOR = 807907444;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionsConfigInfo extends Object {
        public long defaultWalletId;
        public String defaultRwalletInitPublicKey;

        public OptionsConfigInfo() {
        }

        public OptionsConfigInfo(long defaultWalletId, String defaultRwalletInitPublicKey) {
            this.defaultWalletId = defaultWalletId;
            this.defaultRwalletInitPublicKey = defaultRwalletInitPublicKey;
        }

        public static final int CONSTRUCTOR = 129457942;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionsInfo extends Object {
        public OptionsConfigInfo configInfo;

        public OptionsInfo() {
        }

        public OptionsInfo(OptionsConfigInfo configInfo) {
            this.configInfo = configInfo;
        }

        public static final int CONSTRUCTOR = -64676736;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PchanAction extends Object {
    }

    public static class PchanActionInit extends PchanAction {
        public long incA;
        public long incB;
        public long minA;
        public long minB;

        public PchanActionInit() {
        }

        public PchanActionInit(long incA, long incB, long minA, long minB) {
            this.incA = incA;
            this.incB = incB;
            this.minA = minA;
            this.minB = minB;
        }

        public static final int CONSTRUCTOR = 439088778;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanActionClose extends PchanAction {
        public long extraA;
        public long extraB;
        public PchanPromise promise;

        public PchanActionClose() {
        }

        public PchanActionClose(long extraA, long extraB, PchanPromise promise) {
            this.extraA = extraA;
            this.extraB = extraB;
            this.promise = promise;
        }

        public static final int CONSTRUCTOR = 1671187222;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanActionTimeout extends PchanAction {

        public PchanActionTimeout() {
        }

        public static final int CONSTRUCTOR = 1998487795;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanConfig extends Object {
        public String alicePublicKey;
        public AccountAddress aliceAddress;
        public String bobPublicKey;
        public AccountAddress bobAddress;
        public int initTimeout;
        public int closeTimeout;
        public long channelId;

        public PchanConfig() {
        }

        public PchanConfig(String alicePublicKey, AccountAddress aliceAddress, String bobPublicKey, AccountAddress bobAddress, int initTimeout, int closeTimeout, long channelId) {
            this.alicePublicKey = alicePublicKey;
            this.aliceAddress = aliceAddress;
            this.bobPublicKey = bobPublicKey;
            this.bobAddress = bobAddress;
            this.initTimeout = initTimeout;
            this.closeTimeout = closeTimeout;
            this.channelId = channelId;
        }

        public static final int CONSTRUCTOR = -2071530442;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanPromise extends Object {
        public byte[] signature;
        public long promiseA;
        public long promiseB;
        public long channelId;

        public PchanPromise() {
        }

        public PchanPromise(byte[] signature, long promiseA, long promiseB, long channelId) {
            this.signature = signature;
            this.promiseA = promiseA;
            this.promiseB = promiseB;
            this.channelId = channelId;
        }

        public static final int CONSTRUCTOR = -1576102819;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class PchanState extends Object {
    }

    public static class PchanStateInit extends PchanState {
        public boolean signedA;
        public boolean signedB;
        public long minA;
        public long minB;
        public long expireAt;
        public long A;
        public long B;

        public PchanStateInit() {
        }

        public PchanStateInit(boolean signedA, boolean signedB, long minA, long minB, long expireAt, long A, long B) {
            this.signedA = signedA;
            this.signedB = signedB;
            this.minA = minA;
            this.minB = minB;
            this.expireAt = expireAt;
            this.A = A;
            this.B = B;
        }

        public static final int CONSTRUCTOR = -1188426504;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanStateClose extends PchanState {
        public boolean signedA;
        public boolean signedB;
        public long minA;
        public long minB;
        public long expireAt;
        public long A;
        public long B;

        public PchanStateClose() {
        }

        public PchanStateClose(boolean signedA, boolean signedB, long minA, long minB, long expireAt, long A, long B) {
            this.signedA = signedA;
            this.signedB = signedB;
            this.minA = minA;
            this.minB = minB;
            this.expireAt = expireAt;
            this.A = A;
            this.B = B;
        }

        public static final int CONSTRUCTOR = 887226867;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanStatePayout extends PchanState {
        public long A;
        public long B;

        public PchanStatePayout() {
        }

        public PchanStatePayout(long A, long B) {
            this.A = A;
            this.B = B;
        }

        public static final int CONSTRUCTOR = 664671303;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class QueryFees extends Object {
        public Fees sourceFees;
        public Fees[] destinationFees;

        public QueryFees() {
        }

        public QueryFees(Fees sourceFees, Fees[] destinationFees) {
            this.sourceFees = sourceFees;
            this.destinationFees = destinationFees;
        }

        public static final int CONSTRUCTOR = 1614616510;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class QueryInfo extends Object {
        public long id;
        public long validUntil;
        public byte[] bodyHash;
        public byte[] body;
        public byte[] initState;

        public QueryInfo() {
        }

        public QueryInfo(long id, long validUntil, byte[] bodyHash, byte[] body, byte[] initState) {
            this.id = id;
            this.validUntil = validUntil;
            this.bodyHash = bodyHash;
            this.body = body;
            this.initState = initState;
        }

        public static final int CONSTRUCTOR = 1451875440;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawExtMessageInfo extends Object {
        public byte[] hash;

        public RawExtMessageInfo() {
        }

        public RawExtMessageInfo(byte[] hash) {
            this.hash = hash;
        }

        public static final int CONSTRUCTOR = 874086318;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawFullAccountState extends Object {
        public long balance;
        public byte[] code;
        public byte[] data;
        public InternalTransactionId lastTransactionId;
        public TonBlockIdExt blockId;
        public byte[] frozenHash;
        public long syncUtime;

        public RawFullAccountState() {
        }

        public RawFullAccountState(long balance, byte[] code, byte[] data, InternalTransactionId lastTransactionId, TonBlockIdExt blockId, byte[] frozenHash, long syncUtime) {
            this.balance = balance;
            this.code = code;
            this.data = data;
            this.lastTransactionId = lastTransactionId;
            this.blockId = blockId;
            this.frozenHash = frozenHash;
            this.syncUtime = syncUtime;
        }

        public static final int CONSTRUCTOR = -1465398385;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawMessage extends Object {
        public AccountAddress source;
        public AccountAddress destination;
        public long value;
        public long fwdFee;
        public long ihrFee;
        public long createdLt;
        public byte[] bodyHash;
        public MsgData msgData;

        public RawMessage() {
        }

        public RawMessage(AccountAddress source, AccountAddress destination, long value, long fwdFee, long ihrFee, long createdLt, byte[] bodyHash, MsgData msgData) {
            this.source = source;
            this.destination = destination;
            this.value = value;
            this.fwdFee = fwdFee;
            this.ihrFee = ihrFee;
            this.createdLt = createdLt;
            this.bodyHash = bodyHash;
            this.msgData = msgData;
        }

        public static final int CONSTRUCTOR = 1368093263;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawTransaction extends Object {
        public long utime;
        public byte[] data;
        public InternalTransactionId transactionId;
        public long fee;
        public long storageFee;
        public long otherFee;
        public RawMessage inMsg;
        public RawMessage[] outMsgs;

        public RawTransaction() {
        }

        public RawTransaction(long utime, byte[] data, InternalTransactionId transactionId, long fee, long storageFee, long otherFee, RawMessage inMsg, RawMessage[] outMsgs) {
            this.utime = utime;
            this.data = data;
            this.transactionId = transactionId;
            this.fee = fee;
            this.storageFee = storageFee;
            this.otherFee = otherFee;
            this.inMsg = inMsg;
            this.outMsgs = outMsgs;
        }

        public static final int CONSTRUCTOR = 1887601793;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawTransactions extends Object {
        public RawTransaction[] transactions;
        public InternalTransactionId previousTransactionId;

        public RawTransactions() {
        }

        public RawTransactions(RawTransaction[] transactions, InternalTransactionId previousTransactionId) {
            this.transactions = transactions;
            this.previousTransactionId = previousTransactionId;
        }

        public static final int CONSTRUCTOR = -2063931155;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RwalletActionInit extends Object {
        public RwalletConfig config;

        public RwalletActionInit() {
        }

        public RwalletActionInit(RwalletConfig config) {
            this.config = config;
        }

        public static final int CONSTRUCTOR = 624147819;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RwalletConfig extends Object {
        public long startAt;
        public RwalletLimit[] limits;

        public RwalletConfig() {
        }

        public RwalletConfig(long startAt, RwalletLimit[] limits) {
            this.startAt = startAt;
            this.limits = limits;
        }

        public static final int CONSTRUCTOR = -85490534;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RwalletLimit extends Object {
        public int seconds;
        public long value;

        public RwalletLimit() {
        }

        public RwalletLimit(int seconds, long value) {
            this.seconds = seconds;
            this.value = value;
        }

        public static final int CONSTRUCTOR = 1222571646;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcInfo extends Object {
        public long id;

        public SmcInfo() {
        }

        public SmcInfo(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = 1134270012;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcLibraryEntry extends Object {
        public byte[] hash;
        public byte[] data;

        public SmcLibraryEntry() {
        }

        public SmcLibraryEntry(byte[] hash, byte[] data) {
            this.hash = hash;
            this.data = data;
        }

        public static final int CONSTRUCTOR = -1546268148;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcLibraryResult extends Object {
        public SmcLibraryEntry[] result;

        public SmcLibraryResult() {
        }

        public SmcLibraryResult(SmcLibraryEntry[] result) {
            this.result = result;
        }

        public static final int CONSTRUCTOR = 203930622;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class SmcMethodId extends Object {
    }

    public static class SmcMethodIdNumber extends SmcMethodId {
        public int number;

        public SmcMethodIdNumber() {
        }

        public SmcMethodIdNumber(int number) {
            this.number = number;
        }

        public static final int CONSTRUCTOR = -1541162500;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcMethodIdName extends SmcMethodId {
        public String name;

        public SmcMethodIdName() {
        }

        public SmcMethodIdName(String name) {
            this.name = name;
        }

        public static final int CONSTRUCTOR = -249036908;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcRunResult extends Object {
        public long gasUsed;
        public TvmStackEntry[] stack;
        public int exitCode;

        public SmcRunResult() {
        }

        public SmcRunResult(long gasUsed, TvmStackEntry[] stack, int exitCode) {
            this.gasUsed = gasUsed;
            this.stack = stack;
            this.exitCode = exitCode;
        }

        public static final int CONSTRUCTOR = 1413805043;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TonBlockIdExt extends Object {
        public int workchain;
        public long shard;
        public int seqno;
        public byte[] rootHash;
        public byte[] fileHash;

        public TonBlockIdExt() {
        }

        public TonBlockIdExt(int workchain, long shard, int seqno, byte[] rootHash, byte[] fileHash) {
            this.workchain = workchain;
            this.shard = shard;
            this.seqno = seqno;
            this.rootHash = rootHash;
            this.fileHash = fileHash;
        }

        public static final int CONSTRUCTOR = 2031156378;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmCell extends Object {
        public byte[] bytes;

        public TvmCell() {
        }

        public TvmCell(byte[] bytes) {
            this.bytes = bytes;
        }

        public static final int CONSTRUCTOR = -413424735;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmList extends Object {
        public TvmStackEntry[] elements;

        public TvmList() {
        }

        public TvmList(TvmStackEntry[] elements) {
            this.elements = elements;
        }

        public static final int CONSTRUCTOR = 1270320392;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmNumberDecimal extends Object {
        public String number;

        public TvmNumberDecimal() {
        }

        public TvmNumberDecimal(String number) {
            this.number = number;
        }

        public static final int CONSTRUCTOR = 1172477619;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmSlice extends Object {
        public byte[] bytes;

        public TvmSlice() {
        }

        public TvmSlice(byte[] bytes) {
            this.bytes = bytes;
        }

        public static final int CONSTRUCTOR = 537299687;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public abstract static class TvmStackEntry extends Object {
    }

    public static class TvmStackEntrySlice extends TvmStackEntry {
        public TvmSlice slice;

        public TvmStackEntrySlice() {
        }

        public TvmStackEntrySlice(TvmSlice slice) {
            this.slice = slice;
        }

        public static final int CONSTRUCTOR = 1395485477;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmStackEntryCell extends TvmStackEntry {
        public TvmCell cell;

        public TvmStackEntryCell() {
        }

        public TvmStackEntryCell(TvmCell cell) {
            this.cell = cell;
        }

        public static final int CONSTRUCTOR = 1303473952;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmStackEntryNumber extends TvmStackEntry {
        public TvmNumberDecimal number;

        public TvmStackEntryNumber() {
        }

        public TvmStackEntryNumber(TvmNumberDecimal number) {
            this.number = number;
        }

        public static final int CONSTRUCTOR = 1358642622;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmStackEntryTuple extends TvmStackEntry {
        public TvmTuple tuple;

        public TvmStackEntryTuple() {
        }

        public TvmStackEntryTuple(TvmTuple tuple) {
            this.tuple = tuple;
        }

        public static final int CONSTRUCTOR = -157391908;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmStackEntryList extends TvmStackEntry {
        public TvmList list;

        public TvmStackEntryList() {
        }

        public TvmStackEntryList(TvmList list) {
            this.list = list;
        }

        public static final int CONSTRUCTOR = -1186714229;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmStackEntryUnsupported extends TvmStackEntry {

        public TvmStackEntryUnsupported() {
        }

        public static final int CONSTRUCTOR = 378880498;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class TvmTuple extends Object {
        public TvmStackEntry[] elements;

        public TvmTuple() {
        }

        public TvmTuple(TvmStackEntry[] elements) {
            this.elements = elements;
        }

        public static final int CONSTRUCTOR = -1363953053;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class AddLogMessage extends Function {
        public int verbosityLevel;
        public String text;

        public AddLogMessage() {
        }

        public AddLogMessage(int verbosityLevel, String text) {
            this.verbosityLevel = verbosityLevel;
            this.text = text;
        }

        public static final int CONSTRUCTOR = 1597427692;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksGetBlockHeader extends Function {
        public TonBlockIdExt id;

        public BlocksGetBlockHeader() {
        }

        public BlocksGetBlockHeader(TonBlockIdExt id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = 1915102018;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksGetMasterchainBlockSignatures extends Function {
        public int seqno;

        public BlocksGetMasterchainBlockSignatures() {
        }

        public BlocksGetMasterchainBlockSignatures(int seqno) {
            this.seqno = seqno;
        }

        public static final int CONSTRUCTOR = 1616913876;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksGetMasterchainInfo extends Function {

        public BlocksGetMasterchainInfo() {
        }

        public static final int CONSTRUCTOR = -45493615;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksGetShardBlockProof extends Function {
        public TonBlockIdExt id;
        public int mode;
        public TonBlockIdExt from;

        public BlocksGetShardBlockProof() {
        }

        public BlocksGetShardBlockProof(TonBlockIdExt id, int mode, TonBlockIdExt from) {
            this.id = id;
            this.mode = mode;
            this.from = from;
        }

        public static final int CONSTRUCTOR = 435003111;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksGetShards extends Function {
        public TonBlockIdExt id;

        public BlocksGetShards() {
        }

        public BlocksGetShards(TonBlockIdExt id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = 2072773677;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksGetTransactions extends Function {
        public TonBlockIdExt id;
        public int mode;
        public int count;
        public BlocksAccountTransactionId after;

        public BlocksGetTransactions() {
        }

        public BlocksGetTransactions(TonBlockIdExt id, int mode, int count, BlocksAccountTransactionId after) {
            this.id = id;
            this.mode = mode;
            this.count = count;
            this.after = after;
        }

        public static final int CONSTRUCTOR = -896152271;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class BlocksLookupBlock extends Function {
        public int mode;
        public TonBlockId id;
        public long lt;
        public int utime;

        public BlocksLookupBlock() {
        }

        public BlocksLookupBlock(int mode, TonBlockId id, long lt, int utime) {
            this.mode = mode;
            this.id = id;
            this.lt = lt;
            this.utime = utime;
        }

        public static final int CONSTRUCTOR = 1418484659;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ChangeLocalPassword extends Function {
        public InputKey inputKey;
        public byte[] newLocalPassword;

        public ChangeLocalPassword() {
        }

        public ChangeLocalPassword(InputKey inputKey, byte[] newLocalPassword) {
            this.inputKey = inputKey;
            this.newLocalPassword = newLocalPassword;
        }

        public static final int CONSTRUCTOR = -401590337;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Close extends Function {

        public Close() {
        }

        public static final int CONSTRUCTOR = -1187782273;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateNewKey extends Function {
        public byte[] localPassword;
        public byte[] mnemonicPassword;
        public byte[] randomExtraSeed;

        public CreateNewKey() {
        }

        public CreateNewKey(byte[] localPassword, byte[] mnemonicPassword, byte[] randomExtraSeed) {
            this.localPassword = localPassword;
            this.mnemonicPassword = mnemonicPassword;
            this.randomExtraSeed = randomExtraSeed;
        }

        public static final int CONSTRUCTOR = -1861385712;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class CreateQuery extends Function {
        public InputKey privateKey;
        public AccountAddress address;
        public int timeout;
        public Action action;
        public InitialAccountState initialAccountState;

        public CreateQuery() {
        }

        public CreateQuery(InputKey privateKey, AccountAddress address, int timeout, Action action, InitialAccountState initialAccountState) {
            this.privateKey = privateKey;
            this.address = address;
            this.timeout = timeout;
            this.action = action;
            this.initialAccountState = initialAccountState;
        }

        public static final int CONSTRUCTOR = -242540347;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Decrypt extends Function {
        public byte[] encryptedData;
        public byte[] secret;

        public Decrypt() {
        }

        public Decrypt(byte[] encryptedData, byte[] secret) {
            this.encryptedData = encryptedData;
            this.secret = secret;
        }

        public static final int CONSTRUCTOR = 357991854;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteAllKeys extends Function {

        public DeleteAllKeys() {
        }

        public static final int CONSTRUCTOR = 1608776483;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DeleteKey extends Function {
        public Key key;

        public DeleteKey() {
        }

        public DeleteKey(Key key) {
            this.key = key;
        }

        public static final int CONSTRUCTOR = -1579595571;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class DnsResolve extends Function {
        public AccountAddress accountAddress;
        public String name;
        public byte[] category;
        public int ttl;

        public DnsResolve() {
        }

        public DnsResolve(AccountAddress accountAddress, String name, byte[] category, int ttl) {
            this.accountAddress = accountAddress;
            this.name = name;
            this.category = category;
            this.ttl = ttl;
        }

        public static final int CONSTRUCTOR = 1791399222;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Encrypt extends Function {
        public byte[] decryptedData;
        public byte[] secret;

        public Encrypt() {
        }

        public Encrypt(byte[] decryptedData, byte[] secret) {
            this.decryptedData = decryptedData;
            this.secret = secret;
        }

        public static final int CONSTRUCTOR = -1821422820;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportEncryptedKey extends Function {
        public InputKey inputKey;
        public byte[] keyPassword;

        public ExportEncryptedKey() {
        }

        public ExportEncryptedKey(InputKey inputKey, byte[] keyPassword) {
            this.inputKey = inputKey;
            this.keyPassword = keyPassword;
        }

        public static final int CONSTRUCTOR = 218237311;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportKey extends Function {
        public InputKey inputKey;

        public ExportKey() {
        }

        public ExportKey(InputKey inputKey) {
            this.inputKey = inputKey;
        }

        public static final int CONSTRUCTOR = -1622353549;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportPemKey extends Function {
        public InputKey inputKey;
        public byte[] keyPassword;

        public ExportPemKey() {
        }

        public ExportPemKey(InputKey inputKey, byte[] keyPassword) {
            this.inputKey = inputKey;
            this.keyPassword = keyPassword;
        }

        public static final int CONSTRUCTOR = -643259462;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ExportUnencryptedKey extends Function {
        public InputKey inputKey;

        public ExportUnencryptedKey() {
        }

        public ExportUnencryptedKey(InputKey inputKey) {
            this.inputKey = inputKey;
        }

        public static final int CONSTRUCTOR = -634665152;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAccountAddress extends Function {
        public InitialAccountState initialAccountState;
        public int revision;
        public int workchainId;

        public GetAccountAddress() {
        }

        public GetAccountAddress(InitialAccountState initialAccountState, int revision, int workchainId) {
            this.initialAccountState = initialAccountState;
            this.revision = revision;
            this.workchainId = workchainId;
        }

        public static final int CONSTRUCTOR = 512468424;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetAccountState extends Function {
        public AccountAddress accountAddress;

        public GetAccountState() {
        }

        public GetAccountState(AccountAddress accountAddress) {
            this.accountAddress = accountAddress;
        }

        public static final int CONSTRUCTOR = -2116357050;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetBip39Hints extends Function {
        public String prefix;

        public GetBip39Hints() {
        }

        public GetBip39Hints(String prefix) {
            this.prefix = prefix;
        }

        public static final int CONSTRUCTOR = -1889640982;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetConfigParam extends Function {
        public int mode;
        public TonBlockIdExt id;
        public int param;

        public GetConfigParam() {
        }

        public GetConfigParam(int mode, TonBlockIdExt id, int param) {
            this.mode = mode;
            this.id = id;
            this.param = param;
        }

        public static final int CONSTRUCTOR = 35124362;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogStream extends Function {

        public GetLogStream() {
        }

        public static final int CONSTRUCTOR = 1167608667;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogTagVerbosityLevel extends Function {
        public String tag;

        public GetLogTagVerbosityLevel() {
        }

        public GetLogTagVerbosityLevel(String tag) {
            this.tag = tag;
        }

        public static final int CONSTRUCTOR = 951004547;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogTags extends Function {

        public GetLogTags() {
        }

        public static final int CONSTRUCTOR = -254449190;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GetLogVerbosityLevel extends Function {

        public GetLogVerbosityLevel() {
        }

        public static final int CONSTRUCTOR = 594057956;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GuessAccount extends Function {
        public String publicKey;
        public String rwalletInitPublicKey;

        public GuessAccount() {
        }

        public GuessAccount(String publicKey, String rwalletInitPublicKey) {
            this.publicKey = publicKey;
            this.rwalletInitPublicKey = rwalletInitPublicKey;
        }

        public static final int CONSTRUCTOR = -1737659296;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class GuessAccountRevision extends Function {
        public InitialAccountState initialAccountState;
        public int workchainId;

        public GuessAccountRevision() {
        }

        public GuessAccountRevision(InitialAccountState initialAccountState, int workchainId) {
            this.initialAccountState = initialAccountState;
            this.workchainId = workchainId;
        }

        public static final int CONSTRUCTOR = 1857589922;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportEncryptedKey extends Function {
        public byte[] localPassword;
        public byte[] keyPassword;
        public ExportedEncryptedKey exportedEncryptedKey;

        public ImportEncryptedKey() {
        }

        public ImportEncryptedKey(byte[] localPassword, byte[] keyPassword, ExportedEncryptedKey exportedEncryptedKey) {
            this.localPassword = localPassword;
            this.keyPassword = keyPassword;
            this.exportedEncryptedKey = exportedEncryptedKey;
        }

        public static final int CONSTRUCTOR = 656724958;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportKey extends Function {
        public byte[] localPassword;
        public byte[] mnemonicPassword;
        public ExportedKey exportedKey;

        public ImportKey() {
        }

        public ImportKey(byte[] localPassword, byte[] mnemonicPassword, ExportedKey exportedKey) {
            this.localPassword = localPassword;
            this.mnemonicPassword = mnemonicPassword;
            this.exportedKey = exportedKey;
        }

        public static final int CONSTRUCTOR = -1607900903;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportPemKey extends Function {
        public byte[] localPassword;
        public byte[] keyPassword;
        public ExportedPemKey exportedKey;

        public ImportPemKey() {
        }

        public ImportPemKey(byte[] localPassword, byte[] keyPassword, ExportedPemKey exportedKey) {
            this.localPassword = localPassword;
            this.keyPassword = keyPassword;
            this.exportedKey = exportedKey;
        }

        public static final int CONSTRUCTOR = 76385617;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class ImportUnencryptedKey extends Function {
        public byte[] localPassword;
        public ExportedUnencryptedKey exportedUnencryptedKey;

        public ImportUnencryptedKey() {
        }

        public ImportUnencryptedKey(byte[] localPassword, ExportedUnencryptedKey exportedUnencryptedKey) {
            this.localPassword = localPassword;
            this.exportedUnencryptedKey = exportedUnencryptedKey;
        }

        public static final int CONSTRUCTOR = -1184671467;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Init extends Function {
        public Options options;

        public Init() {
        }

        public Init(Options options) {
            this.options = options;
        }

        public static final int CONSTRUCTOR = -1000594762;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Kdf extends Function {
        public byte[] password;
        public byte[] salt;
        public int iterations;

        public Kdf() {
        }

        public Kdf(byte[] password, byte[] salt, int iterations) {
            this.password = password;
            this.salt = salt;
            this.iterations = iterations;
        }

        public static final int CONSTRUCTOR = -1667861635;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class LiteServerGetInfo extends Function {

        public LiteServerGetInfo() {
        }

        public static final int CONSTRUCTOR = 1435327470;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDecrypt extends Function {
        public InputKey inputKey;
        public MsgDataEncryptedArray data;

        public MsgDecrypt() {
        }

        public MsgDecrypt(InputKey inputKey, MsgDataEncryptedArray data) {
            this.inputKey = inputKey;
            this.data = data;
        }

        public static final int CONSTRUCTOR = 223596297;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class MsgDecryptWithProof extends Function {
        public byte[] proof;
        public MsgDataEncrypted data;

        public MsgDecryptWithProof() {
        }

        public MsgDecryptWithProof(byte[] proof, MsgDataEncrypted data) {
            this.proof = proof;
            this.data = data;
        }

        public static final int CONSTRUCTOR = -2111649663;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OnLiteServerQueryError extends Function {
        public long id;
        public Error error;

        public OnLiteServerQueryError() {
        }

        public OnLiteServerQueryError(long id, Error error) {
            this.id = id;
            this.error = error;
        }

        public static final int CONSTRUCTOR = -677427533;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OnLiteServerQueryResult extends Function {
        public long id;
        public byte[] bytes;

        public OnLiteServerQueryResult() {
        }

        public OnLiteServerQueryResult(long id, byte[] bytes) {
            this.id = id;
            this.bytes = bytes;
        }

        public static final int CONSTRUCTOR = 2056444510;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionsSetConfig extends Function {
        public Config config;

        public OptionsSetConfig() {
        }

        public OptionsSetConfig(Config config) {
            this.config = config;
        }

        public static final int CONSTRUCTOR = 1870064579;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class OptionsValidateConfig extends Function {
        public Config config;

        public OptionsValidateConfig() {
        }

        public OptionsValidateConfig(Config config) {
            this.config = config;
        }

        public static final int CONSTRUCTOR = -346965447;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PackAccountAddress extends Function {
        public UnpackedAccountAddress accountAddress;

        public PackAccountAddress() {
        }

        public PackAccountAddress(UnpackedAccountAddress accountAddress) {
            this.accountAddress = accountAddress;
        }

        public static final int CONSTRUCTOR = -1388561940;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanPackPromise extends Function {
        public PchanPromise promise;

        public PchanPackPromise() {
        }

        public PchanPackPromise(PchanPromise promise) {
            this.promise = promise;
        }

        public static final int CONSTRUCTOR = -851703103;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanSignPromise extends Function {
        public InputKey inputKey;
        public PchanPromise promise;

        public PchanSignPromise() {
        }

        public PchanSignPromise(InputKey inputKey, PchanPromise promise) {
            this.inputKey = inputKey;
            this.promise = promise;
        }

        public static final int CONSTRUCTOR = 1814322974;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanUnpackPromise extends Function {
        public byte[] data;

        public PchanUnpackPromise() {
        }

        public PchanUnpackPromise(byte[] data) {
            this.data = data;
        }

        public static final int CONSTRUCTOR = -1250106157;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class PchanValidatePromise extends Function {
        public byte[] publicKey;
        public PchanPromise promise;

        public PchanValidatePromise() {
        }

        public PchanValidatePromise(byte[] publicKey, PchanPromise promise) {
            this.publicKey = publicKey;
            this.promise = promise;
        }

        public static final int CONSTRUCTOR = 258262242;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class QueryEstimateFees extends Function {
        public long id;
        public boolean ignoreChksig;

        public QueryEstimateFees() {
        }

        public QueryEstimateFees(long id, boolean ignoreChksig) {
            this.id = id;
            this.ignoreChksig = ignoreChksig;
        }

        public static final int CONSTRUCTOR = -957002175;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class QueryForget extends Function {
        public long id;

        public QueryForget() {
        }

        public QueryForget(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = -1211985313;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class QueryGetInfo extends Function {
        public long id;

        public QueryGetInfo() {
        }

        public QueryGetInfo(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = -799333669;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class QuerySend extends Function {
        public long id;

        public QuerySend() {
        }

        public QuerySend(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = 925242739;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawCreateAndSendMessage extends Function {
        public AccountAddress destination;
        public byte[] initialAccountState;
        public byte[] data;

        public RawCreateAndSendMessage() {
        }

        public RawCreateAndSendMessage(AccountAddress destination, byte[] initialAccountState, byte[] data) {
            this.destination = destination;
            this.initialAccountState = initialAccountState;
            this.data = data;
        }

        public static final int CONSTRUCTOR = -772224603;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawCreateQuery extends Function {
        public AccountAddress destination;
        public byte[] initCode;
        public byte[] initData;
        public byte[] body;

        public RawCreateQuery() {
        }

        public RawCreateQuery(AccountAddress destination, byte[] initCode, byte[] initData, byte[] body) {
            this.destination = destination;
            this.initCode = initCode;
            this.initData = initData;
            this.body = body;
        }

        public static final int CONSTRUCTOR = -1928557909;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawGetAccountState extends Function {
        public AccountAddress accountAddress;

        public RawGetAccountState() {
        }

        public RawGetAccountState(AccountAddress accountAddress) {
            this.accountAddress = accountAddress;
        }

        public static final int CONSTRUCTOR = -1327847118;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawGetTransactions extends Function {
        public InputKey privateKey;
        public AccountAddress accountAddress;
        public InternalTransactionId fromTransactionId;

        public RawGetTransactions() {
        }

        public RawGetTransactions(InputKey privateKey, AccountAddress accountAddress, InternalTransactionId fromTransactionId) {
            this.privateKey = privateKey;
            this.accountAddress = accountAddress;
            this.fromTransactionId = fromTransactionId;
        }

        public static final int CONSTRUCTOR = 1029612317;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawGetTransactionsV2 extends Function {
        public InputKey privateKey;
        public AccountAddress accountAddress;
        public InternalTransactionId fromTransactionId;
        public int count;
        public boolean tryDecodeMessages;

        public RawGetTransactionsV2() {
        }

        public RawGetTransactionsV2(InputKey privateKey, AccountAddress accountAddress, InternalTransactionId fromTransactionId, int count, boolean tryDecodeMessages) {
            this.privateKey = privateKey;
            this.accountAddress = accountAddress;
            this.fromTransactionId = fromTransactionId;
            this.count = count;
            this.tryDecodeMessages = tryDecodeMessages;
        }

        public static final int CONSTRUCTOR = -566264666;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawSendMessage extends Function {
        public byte[] body;

        public RawSendMessage() {
        }

        public RawSendMessage(byte[] body) {
            this.body = body;
        }

        public static final int CONSTRUCTOR = -1789427488;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RawSendMessageReturnHash extends Function {
        public byte[] body;

        public RawSendMessageReturnHash() {
        }

        public RawSendMessageReturnHash(byte[] body) {
            this.body = body;
        }

        public static final int CONSTRUCTOR = -1228445927;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class RunTests extends Function {
        public String dir;

        public RunTests() {
        }

        public RunTests(String dir) {
            this.dir = dir;
        }

        public static final int CONSTRUCTOR = -2039925427;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLogStream extends Function {
        public LogStream logStream;

        public SetLogStream() {
        }

        public SetLogStream(LogStream logStream) {
            this.logStream = logStream;
        }

        public static final int CONSTRUCTOR = -1364199535;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLogTagVerbosityLevel extends Function {
        public String tag;
        public int newVerbosityLevel;

        public SetLogTagVerbosityLevel() {
        }

        public SetLogTagVerbosityLevel(String tag, int newVerbosityLevel) {
            this.tag = tag;
            this.newVerbosityLevel = newVerbosityLevel;
        }

        public static final int CONSTRUCTOR = -2095589738;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SetLogVerbosityLevel extends Function {
        public int newVerbosityLevel;

        public SetLogVerbosityLevel() {
        }

        public SetLogVerbosityLevel(int newVerbosityLevel) {
            this.newVerbosityLevel = newVerbosityLevel;
        }

        public static final int CONSTRUCTOR = -303429678;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcGetCode extends Function {
        public long id;

        public SmcGetCode() {
        }

        public SmcGetCode(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = -2115626088;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcGetData extends Function {
        public long id;

        public SmcGetData() {
        }

        public SmcGetData(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = -427601079;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcGetLibraries extends Function {
        public byte[][] libraryList;

        public SmcGetLibraries() {
        }

        public SmcGetLibraries(byte[][] libraryList) {
            this.libraryList = libraryList;
        }

        public static final int CONSTRUCTOR = 814345749;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcGetState extends Function {
        public long id;

        public SmcGetState() {
        }

        public SmcGetState(long id) {
            this.id = id;
        }

        public static final int CONSTRUCTOR = -214390293;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcLoad extends Function {
        public AccountAddress accountAddress;

        public SmcLoad() {
        }

        public SmcLoad(AccountAddress accountAddress) {
            this.accountAddress = accountAddress;
        }

        public static final int CONSTRUCTOR = -903491521;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class SmcRunGetMethod extends Function {
        public long id;
        public SmcMethodId method;
        public TvmStackEntry[] stack;

        public SmcRunGetMethod() {
        }

        public SmcRunGetMethod(long id, SmcMethodId method, TvmStackEntry[] stack) {
            this.id = id;
            this.method = method;
            this.stack = stack;
        }

        public static final int CONSTRUCTOR = -255261270;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class Sync extends Function {

        public Sync() {
        }

        public static final int CONSTRUCTOR = -1875977070;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class UnpackAccountAddress extends Function {
        public String accountAddress;

        public UnpackAccountAddress() {
        }

        public UnpackAccountAddress(String accountAddress) {
            this.accountAddress = accountAddress;
        }

        public static final int CONSTRUCTOR = -682459063;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

    public static class WithBlock extends Function {
        public TonBlockIdExt id;
        public Function function;

        public WithBlock() {
        }

        public WithBlock(TonBlockIdExt id, Function function) {
            this.id = id;
            this.function = function;
        }

        public static final int CONSTRUCTOR = -789093723;

        @Override
        public int getConstructor() {
            return CONSTRUCTOR;
        }
    }

}
